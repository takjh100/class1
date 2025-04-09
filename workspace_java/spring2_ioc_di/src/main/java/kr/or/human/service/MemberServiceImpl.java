package kr.or.human.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import kr.or.human.dao.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	MemberServiceImpl(){
		System.out.println("MemberServiceImpl 생성자 실행");
	}
	
	// @Autowired의 대상 bean의 후보가 두개 이상이라면
	// 우선순위 1.@Qualifier(Bean id)에 해당하는 객체 찾기
	//       2.@Primary 객체 찾기
	//       3. 둘다 없으면 변수명과 Bean id가 같은 것 찾기
	@Autowired
//	@Qualifier("memberDAOImpl") //@Qualifier : 특정한 (@Repository) Bean id 를 가지고오는 어노테이션
	MemberDAO memberDAO;
	
	// @Autowired, @Resource, @Injest 비슷비슷하게 IoC, DI를 해줌
	
	
	
	@Override
	public List getList() {
		
//		MemberDAO memberDAO = new MemberDAOImpl();
//		MemberDAO memberDAO = new MemberDAOImpl2();
		List list = memberDAO.selectList();
		
		return list;
	}
	
	

}
