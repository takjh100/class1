package kr.or.human.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public interface EmpService {

	@Autowired
	EmpService empService;
	
	
	@Override
	public List<EmpDTO> getEmpList(){
		
		return null;
	}
}
