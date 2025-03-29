package kr.or.human.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.or.human.dao.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	MemberServiceImpl(){
		System.out.println("MemberServiceImpl 생성자 실행");
	}
	
	// IoC
	// inversion of Control
	// 제어의 역전
	// 타입에 맞는 클래스를 찾아서 대신 생성 해줌
	// 정확히 동일한 클래스 또는 자동 형변환 되는 클래스
	
	// DI
	// Dependency Injection
	// 의존성 주입
	// IoC로 생성한 클래스를 변수에 넣어준다
	
	@Autowired
//	@Qualifier("memberDAOImpl")
	MemberDAO memberDAO;
	
	@Override
	public List getList() {
		
//		MemberDAO memberDAO = new MemberDAOImpl();
//		MemberDAO memberDAO = new MemberDAOImpl2();
		List list = memberDAO.selectList();
		
		return list;
	}
	
	

}
