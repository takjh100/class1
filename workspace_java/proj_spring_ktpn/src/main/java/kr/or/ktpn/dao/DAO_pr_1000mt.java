package kr.or.ktpn.dao;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;

import kr.or.ktpn.dto.DTO_md_1000mt;
import kr.or.ktpn.dto.DTO_pr_1000mt;
import kr.or.ktpn.dto.DTO_pr_insert;
import kr.or.ktpn.dto.DTO_rt_1000mt;

public interface DAO_pr_1000mt {

//	public List<DTO_md_1000mt> selectMdList();
	public List<DTO_pr_1000mt> selectPrList(DTO_pr_1000mt dto);
	public List<DTO_pr_1000mt> dePrList(Map<String,String> dto);
	public List<Map<String,Object>> selectAddListAsList();
	public List<Map<String,Object>> selectLineList();
	public List<Map<String,Object>> selectMbList();
	public List<DTO_md_1000mt> insertRt(DTO_md_1000mt dto);
	public int addPr(DTO_pr_insert dto);
	public int updateRt(DTO_rt_1000mt dto) ;
	public int delMd(DTO_md_1000mt dto);
	
	//생산관리관련 데이터
	
	public List<DTO_pr_1000mt> selectDTO();
}
