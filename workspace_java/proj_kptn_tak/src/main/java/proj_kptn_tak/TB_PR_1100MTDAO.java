package proj_kptn_tak;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class TB_PR_1100MTDAO {

    // 데이터 삽입 (Insert)
    public int insert(TB_PR_1100MTDTO dto) {
        System.out.println("TB_PR_1100MTDAO insert 실행");
        int result = -1;

        try {
            // [DB 접속] 시작
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            Connection con = ds.getConnection();

            // [SQL 준비]
            String query = "INSERT INTO TB_PR_1100MT (PROD_CD, MT_MNG_CD, LIUN_NM, ITEM_NM, ITEM_CD, PROD_STRT_TIME, PROD_END_TIME, INDC_QNTT, PROD_QNTT, WORK_NM, EQPM_OPRT_STTS_VAL, PROD_END_YN, DFC_RT) "
                         + "values(?, ?, ?, ?, ?, to_char(sysdate, 'yyyy/mm/dd hh:mm:ss'), '00:00:00', ?, ?, ?,'Y', 'N', null )";
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1, dto.getProd_cd());
            ps.setString(2, dto.getMt_mng_cd());
            ps.setString(3, dto.getLiun_nm());
            ps.setString(4, dto.getItem_nm());
            ps.setString(5, dto.getItem_cd());
            ps.setInt(6, dto.getIndc_qntt());
            ps.setInt(7, dto.getProd_qntt());
            ps.setString(8, dto.getWork_nm());
            

            // [SQL 실행] 및 [결과 확보]
            result = ps.executeUpdate();  // int에는 영향받은 줄의 수

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("insert result"+result);
        return result;
    }

    // 전체라인 조회 (Select)
     public List selectTBPRList(){
		System.out.println("selectTBPRList 실행");
		List list = new ArrayList();

        try {
            // [DB 접속] 시작
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            Connection con = ds.getConnection();

            // [SQL 준비]
            String query = "SELECT * FROM TB_PR_1100MT";
            PreparedStatement ps = con.prepareStatement(query);

            // [SQL 실행] 및 [결과 확보]
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
            	TB_PR_1100MTDTO dto = new TB_PR_1100MTDTO();
                dto.setProd_cd(rs.getString("PROD_CD"));
                dto.setMt_mng_cd(rs.getString("MT_MNG_CD"));
                dto.setLiun_nm(rs.getString("LIUN_NM"));
                dto.setItem_nm(rs.getString("ITEM_NM"));
                dto.setItem_cd(rs.getString("ITEM_CD"));
                dto.setProd_strt_time(rs.getString("PROD_STRT_TIME"));
                dto.setProd_end_time(rs.getString("PROD_END_TIME"));
                dto.setIndc_qntt(rs.getInt("INDC_QNTT"));
                dto.setProd_qntt(rs.getInt("PROD_QNTT"));
                dto.setWork_nm(rs.getString("WORK_NM"));
                dto.setEqpm_oprt_stts_val(rs.getString("EQPM_OPRT_STTS_VAL"));
                dto.setProd_end_yn(rs.getString("PROD_END_YN"));
                
                list.add(dto);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println("TB_PR_1100MTDAO list: "+list);
        return list;
    }
     
     // A라인 조회 (Select)
     public List ALineList(){
    	 System.out.println("ALineList 실행");
    	 List list = new ArrayList();
    	 
    	 try {
    		 // [DB 접속] 시작
    		 Context ctx = new InitialContext();
    		 DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
    		 Connection con = ds.getConnection();
    		 
    		 // [SQL 준비]
    		 String query = "SELECT * FROM TB_PR_1100MT"
    		 		      + "WHERE LIUN_NM LIKE 'A%';";
    		 PreparedStatement ps = con.prepareStatement(query);
    		 
    		 // [SQL 실행] 및 [결과 확보]
    		 ResultSet rs = ps.executeQuery();
    		 while(rs.next()) {
    			 TB_PR_1100MTDTO dto = new TB_PR_1100MTDTO();
    			 dto.setProd_cd(rs.getString("PROD_CD"));
    			 dto.setMt_mng_cd(rs.getString("MT_MNG_CD"));
    			 dto.setLiun_nm(rs.getString("LIUN_NM"));
    			 dto.setItem_nm(rs.getString("ITEM_NM"));
    			 dto.setItem_cd(rs.getString("ITEM_CD"));
    			 dto.setProd_strt_time(rs.getString("PROD_STRT_TIME"));
    			 dto.setProd_end_time(rs.getString("PROD_END_TIME"));
    			 dto.setIndc_qntt(rs.getInt("INDC_QNTT"));
    			 dto.setProd_qntt(rs.getInt("PROD_QNTT"));
    			 dto.setWork_nm(rs.getString("WORK_NM"));
    			 dto.setEqpm_oprt_stts_val(rs.getString("EQPM_OPRT_STTS_VAL"));
    			 dto.setProd_end_yn(rs.getString("PROD_END_YN"));
    			 
    			 list.add(dto);
    		 }
    		 
    		 con.close();
    	 } catch (Exception e) {
    		 e.printStackTrace();
    	 }
//        System.out.println("TB_PR_1100MTDAO list: "+list);
    	 return list;
     }
     
     
     // B라인 조회 (Select)
     public List BLineList(){
    	 System.out.println("BLineList 실행");
    	 List list = new ArrayList();
    	 
    	 try {
    		 // [DB 접속] 시작
    		 Context ctx = new InitialContext();
    		 DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
    		 Connection con = ds.getConnection();
    		 
    		 // [SQL 준비]
    		 String query = "SELECT * FROM TB_PR_1100MT"
     		 		      + "WHERE LIUN_NM LIKE 'B%';";
    		 PreparedStatement ps = con.prepareStatement(query);
    		 
    		 // [SQL 실행] 및 [결과 확보]
    		 ResultSet rs = ps.executeQuery();
    		 while(rs.next()) {
    			 TB_PR_1100MTDTO dto = new TB_PR_1100MTDTO();
    			 dto.setProd_cd(rs.getString("PROD_CD"));
    			 dto.setMt_mng_cd(rs.getString("MT_MNG_CD"));
    			 dto.setLiun_nm(rs.getString("LIUN_NM"));
    			 dto.setItem_nm(rs.getString("ITEM_NM"));
    			 dto.setItem_cd(rs.getString("ITEM_CD"));
    			 dto.setProd_strt_time(rs.getString("PROD_STRT_TIME"));
    			 dto.setProd_end_time(rs.getString("PROD_END_TIME"));
    			 dto.setIndc_qntt(rs.getInt("INDC_QNTT"));
    			 dto.setProd_qntt(rs.getInt("PROD_QNTT"));
    			 dto.setWork_nm(rs.getString("WORK_NM"));
    			 dto.setEqpm_oprt_stts_val(rs.getString("EQPM_OPRT_STTS_VAL"));
    			 dto.setProd_end_yn(rs.getString("PROD_END_YN"));
    			 
    			 list.add(dto);
    		 }
    		 
    		 con.close();
    	 } catch (Exception e) {
    		 e.printStackTrace();
    	 }
//        System.out.println("TB_PR_1100MTDAO list: "+list);
    	 return list;
     }
     
     
     // C라인 조회 (Select)
     public List CLineList(){
    	 System.out.println("CLineList 실행");
    	 List list = new ArrayList();
    	 
    	 try {
    		 // [DB 접속] 시작
    		 Context ctx = new InitialContext();
    		 DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
    		 Connection con = ds.getConnection();
    		 
    		 // [SQL 준비]
    		 String query = "SELECT * FROM TB_PR_1100MT"
     		 		      + "WHERE LIUN_NM LIKE 'C%';";
    		 PreparedStatement ps = con.prepareStatement(query);
    		 
    		 // [SQL 실행] 및 [결과 확보]
    		 ResultSet rs = ps.executeQuery();
    		 while(rs.next()) {
    			 TB_PR_1100MTDTO dto = new TB_PR_1100MTDTO();
    			 dto.setProd_cd(rs.getString("PROD_CD"));
    			 dto.setMt_mng_cd(rs.getString("MT_MNG_CD"));
    			 dto.setLiun_nm(rs.getString("LIUN_NM"));
    			 dto.setItem_nm(rs.getString("ITEM_NM"));
    			 dto.setItem_cd(rs.getString("ITEM_CD"));
    			 dto.setProd_strt_time(rs.getString("PROD_STRT_TIME"));
    			 dto.setProd_end_time(rs.getString("PROD_END_TIME"));
    			 dto.setIndc_qntt(rs.getInt("INDC_QNTT"));
    			 dto.setProd_qntt(rs.getInt("PROD_QNTT"));
    			 dto.setWork_nm(rs.getString("WORK_NM"));
    			 dto.setEqpm_oprt_stts_val(rs.getString("EQPM_OPRT_STTS_VAL"));
    			 dto.setProd_end_yn(rs.getString("PROD_END_YN"));
    			 
    			 list.add(dto);
    		 }
    		 
    		 con.close();
    	 } catch (Exception e) {
    		 e.printStackTrace();
    	 }
//        System.out.println("TB_PR_1100MTDAO list: "+list);
    	 return list;
     }
     
     
    
   
    // 데이터 수정 (Update)
    public int update(TB_PR_1100MTDTO dto) {
        System.out.println("TB_PR_1100MTDAO update 실행");
        int result = -1;

        try {
            // [DB 접속] 시작
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            Connection con = ds.getConnection();

            // [SQL 준비]
            String query = "UPDATE TB_PR_1100MT SET "
                         + "MT_MNG_CD = ?, LIUN_NM = ?, ITEM_NM = ?, ITEM_CD = ?, PROD_STRT_TIME = to_char(sysdate, 'yyyy/mm/dd hh:mm:ss'), PROD_END_TIME = '00:00:00', "
                         + "INDC_QNTT = ?, PROD_QNTT = ?, WORK_NM = ?, EQPM_OPRT_STTS_VAL = 'Y', PROD_END_YN = 'N', DFC_RT = ?"
                         + "WHERE PROD_CD = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, dto.getMt_mng_cd());
            ps.setString(2, dto.getLiun_nm());
            ps.setString(3, dto.getItem_nm());
            ps.setString(4, dto.getItem_cd());
            ps.setInt(5, dto.getIndc_qntt());
            ps.setInt(6, dto.getProd_qntt());
            ps.setString(7, dto.getWork_nm());
            ps.setInt(8, dto.getDfc_rt());
            ps.setString(9, dto.getProd_cd());

            // [SQL 실행] 및 [결과 확보]
            result = ps.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    
    //생산 완료
    public int complete(TB_PR_1100MTDTO dto) {
    	System.out.println("TB_PR_1100MTDAO complete 실행");
    	int result = -1;
    	
    	try {
    		// [DB 접속] 시작
    		Context ctx = new InitialContext();
    		DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
    		Connection con = ds.getConnection();
    		
    		// [SQL 준비]
    		String query = "UPDATE TB_PR_1100MT SET "
    				+ "PROD_END_TIME = to_char(sysdate, 'yyyy/mm/dd hh:mm:ss'), "
    				+ "EQPM_OPRT_STTS_VAL = 'N', PROD_END_YN = 'Y', DFC_RT = ?"
    				+ "WHERE PROD_CD = ?";
    		PreparedStatement ps = con.prepareStatement(query);
    		ps.setInt(1, dto.getDfc_rt());
    		ps.setString(2, dto.getProd_cd());
    		
    		// [SQL 실행] 및 [결과 확보]
    		result = ps.executeUpdate();
    		
    		con.close();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	return result;
    }

	

   
}