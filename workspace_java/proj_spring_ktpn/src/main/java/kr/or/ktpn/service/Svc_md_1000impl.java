package kr.or.ktpn.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ktpn.dao.DAO_md_1000mt;
import kr.or.ktpn.dto.DTO_md_1000mt;


@Service
public class Svc_md_1000impl implements Svc_md_1000mt {

	@Autowired
	DAO_md_1000mt mdDAO;
		
	 @Override
	    public List<DTO_md_1000mt> getMdList(DTO_md_1000mt dto) {
	        // DAO 메소드에 dto를 전달합니다.
	        List<DTO_md_1000mt> list = mdDAO.selectMdList(dto);
	        return list;
	    }
	    
	//생산관리관련 데이터    
	    @Override
	    public List<DTO_md_1000mt> selectDAO_P() {
	        // DAO 메소드에 dto를 전달합니다.
	        List<DTO_md_1000mt> list = mdDAO.selectDTO_P();
	        return list;
	    }
	    @Override
	    public List<DTO_md_1000mt> selectDAO_L() {
	    	// DAO 메소드에 dto를 전달합니다.
	    	List<DTO_md_1000mt> list = mdDAO.selectDTO_L();
	    	return list;
	    }
}
