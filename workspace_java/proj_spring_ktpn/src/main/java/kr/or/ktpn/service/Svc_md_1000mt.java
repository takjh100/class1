package kr.or.ktpn.service;

import java.util.List;
import java.util.Map;

import kr.or.ktpn.dto.DTO_md_1000mt;

public interface Svc_md_1000mt {
	
	public List<DTO_md_1000mt> getMdList(DTO_md_1000mt dto);
	//생산관리관련 데이터
	public List<DTO_md_1000mt> selectDAO_P();
	public List<DTO_md_1000mt> selectDAO_L();

	
}
