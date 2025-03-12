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
            String query = "INSERT INTO TB_PR_1100MT (PROD_CD, MT_MNG_CD, LIUN_NM, ITEM_NM, ITEM_CD, PROD_STRT_TIME, PROD_END_TIME, INDC_QNTT, PROD_QNTT, WORK_NM, EQPM_OPRT_STTS_VAL, PROD_END_YN) "
                         + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, dto.getPROD_CD());
            ps.setString(2, dto.getMT_MNG_CD());
            ps.setString(3, dto.getLIUN_NM());
            ps.setString(4, dto.getITEM_NM());
            ps.setString(5, dto.getITEM_CD());
            ps.setString(6, dto.getPROD_STRT_TIME());
            ps.setString(7, dto.getPROD_END_TIME());
            ps.setInt(8, dto.getINDC_QNTT());
            ps.setInt(9, dto.getPROD_QNTT());
            ps.setString(10, dto.getWORK_NM());
            ps.setString(11, dto.getEQPM_OPRT_STTS_VAL());
            ps.setString(12, dto.getPROD_END_YN());

            // [SQL 실행] 및 [결과 확보]
            result = ps.executeUpdate();  // int에는 영향받은 줄의 수

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    // 데이터 조회 (Select)
    public TB_PR_1100MTDTO select(String prodCd) {
        System.out.println("TB_PR_1100MTDAO select 실행");
        TB_PR_1100MTDTO dto = null;

        try {
            // [DB 접속] 시작
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            Connection con = ds.getConnection();

            // [SQL 준비]
            String query = "SELECT * FROM TB_PR_1100MT WHERE PROD_CD = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, prodCd);

            // [SQL 실행] 및 [결과 확보]
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dto = new TB_PR_1100MTDTO();
                dto.setPROD_CD(rs.getString("PROD_CD"));
                dto.setMT_MNG_CD(rs.getString("MT_MNG_CD"));
                dto.setLIUN_NM(rs.getString("LIUN_NM"));
                dto.setITEM_NM(rs.getString("ITEM_NM"));
                dto.setITEM_CD(rs.getString("ITEM_CD"));
                dto.setPROD_STRT_TIME(rs.getString("PROD_STRT_TIME"));
                dto.setPROD_END_TIME(rs.getString("PROD_END_TIME"));
                dto.setINDC_QNTT(rs.getInt("INDC_QNTT"));
                dto.setPROD_QNTT(rs.getInt("PROD_QNTT"));
                dto.setWORK_NM(rs.getString("WORK_NM"));
                dto.setEQPM_OPRT_STTS_VAL(rs.getString("EQPM_OPRT_STTS_VAL"));
                dto.setPROD_END_YN(rs.getString("PROD_END_YN"));
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dto;
    }

    // 전체 데이터 조회 (Select All)
    public List<TB_PR_1100MTDTO> selectAll() {
        System.out.println("TB_PR_1100MTDAO selectAll 실행");
        List<TB_PR_1100MTDTO> list = new ArrayList<>();

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
            while (rs.next()) {
                TB_PR_1100MTDTO dto = new TB_PR_1100MTDTO();
                dto.setPROD_CD(rs.getString("PROD_CD"));
                dto.setMT_MNG_CD(rs.getString("MT_MNG_CD"));
                dto.setLIUN_NM(rs.getString("LIUN_NM"));
                dto.setITEM_NM(rs.getString("ITEM_NM"));
                dto.setITEM_CD(rs.getString("ITEM_CD"));
                dto.setPROD_STRT_TIME(rs.getString("PROD_STRT_TIME"));
                dto.setPROD_END_TIME(rs.getString("PROD_END_TIME"));
                dto.setINDC_QNTT(rs.getInt("INDC_QNTT"));
                dto.setPROD_QNTT(rs.getInt("PROD_QNTT"));
                dto.setWORK_NM(rs.getString("WORK_NM"));
                dto.setEQPM_OPRT_STTS_VAL(rs.getString("EQPM_OPRT_STTS_VAL"));
                dto.setPROD_END_YN(rs.getString("PROD_END_YN"));
                list.add(dto);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

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
                         + "MT_MNG_CD = ?, LIUN_NM = ?, ITEM_NM = ?, ITEM_CD = ?, PROD_STRT_TIME = ?, PROD_END_TIME = ?, "
                         + "INDC_QNTT = ?, PROD_QNTT = ?, WORK_NM = ?, EQPM_OPRT_STTS_VAL = ?, PROD_END_YN = ? "
                         + "WHERE PROD_CD = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, dto.getMT_MNG_CD());
            ps.setString(2, dto.getLIUN_NM());
            ps.setString(3, dto.getITEM_NM());
            ps.setString(4, dto.getITEM_CD());
            ps.setString(5, dto.getPROD_STRT_TIME());
            ps.setString(6, dto.getPROD_END_TIME());
            ps.setInt(7, dto.getINDC_QNTT());
            ps.setInt(8, dto.getPROD_QNTT());
            ps.setString(9, dto.getWORK_NM());
            ps.setString(10, dto.getEQPM_OPRT_STTS_VAL());
            ps.setString(11, dto.getPROD_END_YN());
            ps.setString(12, dto.getPROD_CD());

            // [SQL 실행] 및 [결과 확보]
            result = ps.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    // 데이터 삭제 (Delete)
    public int delete(String prodCd) {
        System.out.println("TB_PR_1100MTDAO delete 실행");
        int result = -1;

        try {
            // [DB 접속] 시작
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            Connection con = ds.getConnection();

            // [SQL 준비]
            String query = "DELETE FROM TB_PR_1100MT WHERE PROD_CD = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, prodCd);

            // [SQL 실행] 및 [결과 확보]
            result = ps.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}