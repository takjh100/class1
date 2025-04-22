package kr.or.ktpn.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.ktpn.dto.DTO_md_1000mt;

@Repository
public class DAO_md_1000impl implements DAO_md_1000mt{
	
	@Autowired
	SqlSession sqlSession;
	
	 @Override
     public List<DTO_md_1000mt> selectMdList(DTO_md_1000mt dto) {
         List<DTO_md_1000mt> result = sqlSession.selectList("mapper.md_1000mt.selectMd", dto);
         System.out.println("result : " + result);
         return result;
     }

 	//생산관리관련 데이터
     @Override
     public List<DTO_md_1000mt> selectDTO_P() {
    	 List<DTO_md_1000mt> result = sqlSession.selectList("mapper.TAK_PR_1100MTDTO.MD_1000MT_P");
    	 System.out.println("result : " + result);
    	 return result;
     }
     @Override
     public List<DTO_md_1000mt> selectDTO_L() {
    	 List<DTO_md_1000mt> result = sqlSession.selectList("mapper.TAK_PR_1100MTDTO.MD_1000MT_L");
    	 System.out.println("result : " + result);
    	 return result;
     }


}
