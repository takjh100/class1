package proj_kptn_tak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class test_TB_PR_1000MT_DAO {
	
	// 조회
	List selectTestWorkList(test_TB_PR_1000MT_DTO dto){
		System.out.println("selectTestWorkList 실행");
		List list = new ArrayList();

        try {
            // [DB 접속] 시작
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            Connection con = ds.getConnection();

            // [SQL 준비]
            String query = "SELECT * FROM TB_PR_1000MT where PROD_CD = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, dto.getPROD_CD());
            
            // [SQL 실행] 및 [결과 확보]
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
            	test_TB_PR_1000MT_DTO dto1 = new test_TB_PR_1000MT_DTO();
                
                dto1.setPROD_CD(rs.getString("PROD_CD"));
                dto1.setLIUN_CD(rs.getString("LIUN_CD"));
                //dto1.setLIUN_NM(rs.getString("LIUN_NM"));
                
                
                dto.setINDC_QNTT(rs.getInt("INDC_QNTT"));
                
                
                list.add(dto);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
