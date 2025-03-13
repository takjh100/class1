package proj_kptn_tak;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class TB_PR_1110MTDAO {

	// 데이터 삽입 (Insert)
	public int insert(TB_PR_1110MTDTO dto) {
		System.out.println("TB_PR_1110MTDAO insert 실행");
		int result = -1;

		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			String query = "INSERT INTO TB_PR_1110MT (PROD_PLN_CD, ITEM_NM, TRG_PROD_CNT, PROD_STRT_DT, PROD_END_DT, MT_MNG_CD) "
					+ "VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, dto.getPROD_PLN_CD());
			ps.setString(2, dto.getITEM_NM());
			ps.setInt(3, dto.getTRG_PROD_CNT());
			ps.setString(4, dto.getPROD_STRT_DT());
			ps.setString(5, dto.getPROD_END_DT());
			ps.setString(6, dto.getMT_MNG_CD());

			// [SQL 실행] 및 [결과 확보]
			result = ps.executeUpdate(); // int에는 영향받은 줄의 수

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	// 데이터 조회 (Select)
	List selectTBPRList() {
		System.out.println("selectTBPRList 실행");
		List list = new ArrayList();

		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			String query = "SELECT * FROM TB_PR_1110MT";
			PreparedStatement ps = con.prepareStatement(query);

			// [SQL 실행] 및 [결과 확보]
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				TB_PR_1110MTDTO dto = new TB_PR_1110MTDTO();
				dto = new TB_PR_1110MTDTO();
				dto.setPROD_PLN_CD(rs.getString("PROD_PLN_CD"));
				dto.setITEM_NM(rs.getString("ITEM_NM"));
				dto.setTRG_PROD_CNT(rs.getInt("TRG_PROD_CNT"));
				dto.setPROD_STRT_DT(rs.getString("PROD_STRT_DT"));
				dto.setPROD_END_DT(rs.getString("PROD_END_DT"));
				dto.setMT_MNG_CD(rs.getString("MT_MNG_CD"));

				list.add(dto);
			}

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	// 데이터 수정 (Update)
	public int update(TB_PR_1110MTDTO dto) {
		System.out.println("TB_PR_1110MTDAO update 실행");
		int result = -1;

		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			String query = "UPDATE TB_PR_1110MT SET "
					+ "ITEM_NM = ?, TRG_PROD_CNT = ?, PROD_STRT_DT = ?, PROD_END_DT = ?, MT_MNG_CD = ? "
					+ "WHERE PROD_PLN_CD = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, dto.getITEM_NM());
			ps.setInt(2, dto.getTRG_PROD_CNT());
			ps.setString(3, dto.getPROD_STRT_DT());
			ps.setString(4, dto.getPROD_END_DT());
			ps.setString(5, dto.getMT_MNG_CD());
			ps.setString(6, dto.getPROD_PLN_CD());

			// [SQL 실행] 및 [결과 확보]
			result = ps.executeUpdate();

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
}
