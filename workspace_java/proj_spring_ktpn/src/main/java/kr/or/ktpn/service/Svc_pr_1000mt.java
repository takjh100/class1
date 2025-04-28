package kr.or.ktpn.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;

import kr.or.ktpn.dto.DTO_pr_1000mt;
import kr.or.ktpn.dto.DTO_pr_insert;
import kr.or.ktpn.dto.TAK_PR_1100MTDTO;

public interface Svc_pr_1000mt {
	
	public List<DTO_pr_1000mt> getPrList(DTO_pr_1000mt dto);
	public List<DTO_pr_1000mt> getdePrList(Map<String,String> dto);
	public List<Map<String,Object>> getAddListMap();
	public List<Map<String,Object>> getLineMap();
	public List<Map<String,Object>> selectMbList();
	public int insertPr(@RequestParam DTO_pr_insert dto);
	
//	작업전
	public List<DTO_pr_1000mt> selectDAO_N();
}	
 