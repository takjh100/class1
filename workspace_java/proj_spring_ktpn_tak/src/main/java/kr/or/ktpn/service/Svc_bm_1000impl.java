package kr.or.ktpn.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ktpn.dao.DAO_bm_1000mt;
import kr.or.ktpn.dto.DTO_bm_1000mt;
import kr.or.ktpn.dto.DTO_md_1000mt;
import kr.or.ktpn.dto.DTO_mr_detail;
import kr.or.ktpn.dto.DTO_mr_insert;


@Service
public class Svc_bm_1000impl implements Svc_bm_1000mt {

	@Autowired
	DAO_bm_1000mt mdDAO;
		
	 @Override
    public List<DTO_bm_1000mt> getBmList(DTO_bm_1000mt dto) {
        // DAO 메소드에 dto를 전달합니다.
        List<DTO_bm_1000mt> list = mdDAO.selectBmList(dto);
        return list;
    }
    @Override
    public List<DTO_md_1000mt> addBm(DTO_md_1000mt dto) {
    	List<DTO_md_1000mt> list = mdDAO.insertBm(dto);
		return list;
	}
    @Override
    public List<DTO_md_1000mt> callList(DTO_md_1000mt dto) {
    	List<DTO_md_1000mt> list = mdDAO.listMr(dto);
    	return list;
    }
    @Override
    public List<DTO_mr_detail> detailBm(DTO_mr_detail mrDTO) {
    	List<DTO_mr_detail> list = mdDAO.detailBm(mrDTO);
    	return list;
    }
    
    @Override
    public int insertBm(DTO_bm_1000mt dto) {
		int countUpdate = mdDAO.addBm(dto);
		return countUpdate;
	}
    @Override
    @SuppressWarnings("unchecked")
    public int insertMr(Map<String,Object> mrMap) {
        // 1) detail 리스트
        List<Map<String,Object>> list
            = (List<Map<String,Object>>) mrMap.get("components");

        // 2) header DTO 생성
        DTO_bm_1000mt header = new DTO_bm_1000mt();
        header.setBom_cd(   (String)mrMap.get("bomCd"));    // JavaBean 표기
        header.setBom_nm(   (String)mrMap.get("bomNm"));
        header.setItem_cd(  (String)mrMap.get("itemCd"));

        // 부모 테이블 insert
        mdDAO.addBm(header);
        System.out.println(header);

        // 3) detail insert
        int totalInserted = 0;
        for (Map<String,Object> comp : list) {
            // MyBatis 매퍼가 #{bom_cd}, #{alpha}, #{amount}, #{gram} 을 기대한다면:
            comp.put("bom_cd",   header.getBom_cd());
            comp.put("alpha",    comp.get("alpha"));   // 그냥 넘어온 값
            comp.put("amount",   comp.get("amount"));
            comp.put("gram",     comp.get("gram"));
            // ...필요한 대로 키 추가...

            totalInserted += mdDAO.addMr(comp);
        }
        return totalInserted;
    }
    
    @Override
    public int modBm(DTO_mr_insert dto) {
        // 배열로 넘어온 값들
        String[] alphas  = dto.getAlpha1();
        String[] amounts = dto.getAmount1();
        // sn이 "12,13" 같은 콤마 구분 문자열이라면 split 필요
        String[] snArr   = String.valueOf(dto.getSn()).split(",");

        if (snArr.length < alphas.length) {
            int orig = snArr.length;
            // alphas.length 만큼 새 배열을 만들고, 기존 데이터를 복사
            snArr = Arrays.copyOf(snArr, alphas.length);
            // 추가된 칸(인덱스 orig ~ alphas.length-1)에 "0" 채우기
            for (int i = orig; i < snArr.length; i++) {
                snArr[i] = "0";
            }
        }
        
        int totalUpdated = 0;
        int n = snArr.length;
        System.out.println(n);
        System.out.println(amounts.length);
        
 
        for (int i = 0; i < amounts.length; i++) {
            // dto에 단일 건 정보 세팅
            dto.setAlpha(alphas[i]);
            dto.setAmount(amounts[i]);
            dto.setSn(snArr[i]);  // sn 필드는 Integer로 선언돼 있어야 null-safe

            // 필요하다면 dto.getBom_cd(), dto.getH_mr_nm(), dto.getGram() 등도 이미 세팅된 값 사용
            totalUpdated += mdDAO.updateBm(dto);
        }

        return totalUpdated;
    }
    
    @Override
    public int delMr(DTO_mr_insert dto) {
    	int countUpdate = mdDAO.delMr(dto);
    	return countUpdate;
    }
    
    
    
    
   
	    
}
