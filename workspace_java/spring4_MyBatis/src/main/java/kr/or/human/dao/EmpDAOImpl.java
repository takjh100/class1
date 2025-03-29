package kr.or.human.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDAOImpl implements EmpDAO {

	@Autowired
	SqlSession sqlSession;

	@Override
	public List<EmpDAO> selectEmpList() {
		List<EmpDAO> result = sqlSession.selectList("mapper.emp.selectEmp");
		System.out.println("result : "+ result);
		return result;
	}

}
