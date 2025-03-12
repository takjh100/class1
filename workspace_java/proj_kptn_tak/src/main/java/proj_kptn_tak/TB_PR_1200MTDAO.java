package proj_kptn_tak;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class TB_PR_1200MTDAO {

    // 데이터 삽입 (Insert)
    public int insert(TB_PR_1200MTDTO dto) {
        System.out.println("TB_PR_1200MTDAO insert 실행");
        int result = -1;

        try {
            // [DB 접속] 시작
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            Connection con = ds.getConnection();

            // [SQL 준비]
            String query = "INSERT INTO TB_PR_1200MT (LIUN_NM, ITEM_NM, UNIT_NO, DLY_PRDC_QNTT, DLY_DFC_RT, INDC_QNTT) "
                         + "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, dto.getLIUN_NM());
            ps.setString(2, dto.getITEM_NM());
            ps.setString(3, dto.getUNIT_NO());
            ps.setInt(4, dto.getDLY_PRDC_QNTT());
            ps.setInt(5, dto.getDLY_DFC_RT());
            ps.setInt(6, dto.getINDC_QNTT());

            // [SQL 실행] 및 [결과 확보]
            result = ps.executeUpdate();  // 영향받은 줄의 수

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    // 데이터 조회 (Select)
    public TB_PR_1200MTDTO select(String unitNo) {
        System.out.println("TB_PR_1200MTDAO select 실행");
        TB_PR_1200MTDTO dto = null;

        try {
            // [DB 접속] 시작
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            Connection con = ds.getConnection();

            // [SQL 준비]
            String query = "SELECT * FROM TB_PR_1200MT WHERE UNIT_NO = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, unitNo);

            // [SQL 실행] 및 [결과 확보]
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dto = new TB_PR_1200MTDTO();
                dto.setLIUN_NM(rs.getString("LIUN_NM"));
                dto.setITEM_NM(rs.getString("ITEM_NM"));
                dto.setUNIT_NO(rs.getString("UNIT_NO"));
                dto.setDLY_PRDC_QNTT(rs.getInt("DLY_PRDC_QNTT"));
                dto.setDLY_DFC_RT(rs.getInt("DLY_DFC_RT"));
                dto.setINDC_QNTT(rs.getInt("INDC_QNTT"));
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dto;
    }

    // 전체 데이터 조회 (Select All)
    public List<TB_PR_1200MTDTO> selectAll() {
        System.out.println("TB_PR_1200MTDAO selectAll 실행");
        List<TB_PR_1200MTDTO> list = new ArrayList<>();

        try {
            // [DB 접속] 시작
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            Connection con = ds.getConnection();

            // [SQL 준비]
            String query = "SELECT * FROM TB_PR_1200MT";
            PreparedStatement ps = con.prepareStatement(query);

            // [SQL 실행] 및 [결과 확보]
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TB_PR_1200MTDTO dto = new TB_PR_1200MTDTO();
                dto.setLIUN_NM(rs.getString("LIUN_NM"));
                dto.setITEM_NM(rs.getString("ITEM_NM"));
                dto.setUNIT_NO(rs.getString("UNIT_NO"));
                dto.setDLY_PRDC_QNTT(rs.getInt("DLY_PRDC_QNTT"));
                dto.setDLY_DFC_RT(rs.getInt("DLY_DFC_RT"));
                dto.setINDC_QNTT(rs.getInt("INDC_QNTT"));
                list.add(dto);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // 데이터 수정 (Update)
    public int update(TB_PR_1200MTDTO dto) {
        System.out.println("TB_PR_1200MTDAO update 실행");
        int result = -1;

        try {
            // [DB 접속] 시작
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            Connection con = ds.getConnection();

            // [SQL 준비]
            String query = "UPDATE TB_PR_1200MT SET "
                         + "LIUN_NM = ?, ITEM_NM = ?, DLY_PRDC_QNTT = ?, DLY_DFC_RT = ?, INDC_QNTT = ? "
                         + "WHERE UNIT_NO = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, dto.getLIUN_NM());
            ps.setString(2, dto.getITEM_NM());
            ps.setInt(3, dto.getDLY_PRDC_QNTT());
            ps.setInt(4, dto.getDLY_DFC_RT());
            ps.setInt(5, dto.getINDC_QNTT());
            ps.setString(6, dto.getUNIT_NO());

            // [SQL 실행] 및 [결과 확보]
            result = ps.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    // 데이터 삭제 (Delete)
    public int delete(String unitNo) {
        System.out.println("TB_PR_1200MTDAO delete 실행");
        int result = -1;

        try {
            // [DB 접속] 시작
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            Connection con = ds.getConnection();

            // [SQL 준비]
            String query = "DELETE FROM TB_PR_1200MT WHERE UNIT_NO = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, unitNo);

            // [SQL 실행] 및 [결과 확보]
            result = ps.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
