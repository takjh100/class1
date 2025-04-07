package kr.or.human.dao;

import java.util.List;

import kr.or.human.dto.EmpDTO;

public interface EmpDAO {

	List<EmpDAO>selectEmpList();
	
	public EmpDTO selectOneEmp();

	public EmpDTO selectOneEmpno(int empno);

	public EmpDTO selectOneEmpno2(EmpDTO empDTO);
	
	public int updateEmp(EmpDTO empDTO);
	
}
