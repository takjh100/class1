package kr.or.ktpn.dao;

import java.util.List;

import kr.or.ktpn.dto.TAK_PR_1100MTDTO;

public interface TAK_PR_1100MTDAO {
	
	public List<TAK_PR_1100MTDTO> selectDTO();
	public List<TAK_PR_1100MTDTO> selectDTO_A();
	public List<TAK_PR_1100MTDTO> selectDTO_B();
	public List<TAK_PR_1100MTDTO> selectDTO_C();
// 인서트
	public int insertDTO(TAK_PR_1100MTDTO dto);
	
//	pm_popup 수정,완료
	public int updateDTO(TAK_PR_1100MTDTO dto);
	public int completeDTO(TAK_PR_1100MTDTO dto);
}
