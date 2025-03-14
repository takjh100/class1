package proj_kptn_tak;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tb_pr_mt")
public class TB_PR_MTController extends HttpServlet {

	// 데이터 조회
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String type = request.getParameter("type");
		System.out.println("type" + type);
		if ("1110".equals(type)) {
			// TB_PR_1110MTDTO 조회
			TB_PR_1110MTDAO dao = new TB_PR_1110MTDAO();
			List resultList = dao.selectTBPRList();
			request.setAttribute("resultList", resultList);
			request.setAttribute("type", "1110");
			String url = "/pr_popup_tak.jsp";
//			String url = "/WEB-INF/views/pr_popup_tak.jsp";
			request.getRequestDispatcher(url).forward(request, response);
		} else if ("1100".equals(type)) {
			// TB_PR_1100MTDTO 조회
			TB_PR_1100MTDAO dao = new TB_PR_1100MTDAO();
			List resultList = dao.selectTBPRList();
			request.setAttribute("resultList", resultList);
			request.setAttribute("type", "1100");
			String url = "/pm_popup_tak.jsp";
//			String url = "/WEB-INF/views/pm_popup_tak.jsp";
			request.getRequestDispatcher(url).forward(request, response);
		}
	}

	// 데이터 삽입, 수정
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		String command = request.getParameter("command");
		String type = request.getParameter("type");

		if ("insert".equals(command)) {
			if ("1110".equals(type)) {
				// TB_PR_1110MTDTO 삽입
				String itemNm = request.getParameter("itemNm");
				int trgProdCnt = Integer.parseInt(request.getParameter("trgProdCnt"));
				String prodStrtDt = request.getParameter("prodStrtDt");
				String prodEndDt = request.getParameter("prodEndDt");
				String mtMngCd = request.getParameter("mtMngCd");

				TB_PR_1110MTDTO dto = new TB_PR_1110MTDTO();
				dto.setITEM_NM(itemNm);
				dto.setTRG_PROD_CNT(trgProdCnt);
				dto.setPROD_STRT_DT(prodStrtDt);
				dto.setPROD_END_DT(prodEndDt);
				dto.setMT_MNG_CD(mtMngCd);

				TB_PR_1110MTDAO dao = new TB_PR_1110MTDAO();
				int result = dao.insert(dto);
				System.out.println("Insert result: " + result);
			} else if ("1100".equals(type)) {
				// TB_PR_1100MTDTO 삽입
				String itemNm = request.getParameter("itemNm");
				String itemCd = request.getParameter("itemCd");
				String liunNm = request.getParameter("liunNm");
				String prodStrtTime = request.getParameter("prodStrtTime");
				String prodEndTime = request.getParameter("prodEndTime");
				int indcQntt = Integer.parseInt(request.getParameter("indcQntt"));
				int prodQntt = Integer.parseInt(request.getParameter("prodQntt"));
				String workNm = request.getParameter("workNm");
				String eqpmOprtSttsVal = request.getParameter("eqpmOprtSttsVal");
				String prodEndYn = request.getParameter("prodEndYn");
				String prodCD = request.getParameter("prodCD");

				test_TB_PR_1000MT_DTO testDto = new test_TB_PR_1000MT_DTO();
				testDto.setPROD_CD(prodCD);

				test_TB_PR_1000MT_DAO testDao = new test_TB_PR_1000MT_DAO();

				List list = new ArrayList();
				list = testDao.selectTestWorkList(testDto);

				testDto = (test_TB_PR_1000MT_DTO) list.get(0);

				TB_PR_1100MTDTO dto = new TB_PR_1100MTDTO();
				dto.setPROD_CD(testDto.getPROD_CD());
				dto.setMT_MNG_CD(testDto.getLIUN_CD());
				dto.setITEM_NM(itemNm);
				dto.setITEM_CD(itemCd);
				dto.setLIUN_NM(liunNm);
				dto.setPROD_STRT_TIME(prodStrtTime);
				dto.setPROD_END_TIME(prodEndTime);
				dto.setINDC_QNTT(testDto.getINDC_QNTT());
				dto.setPROD_QNTT(prodQntt);
				dto.setWORK_NM(workNm);
				dto.setEQPM_OPRT_STTS_VAL(eqpmOprtSttsVal);
				dto.setPROD_END_YN(prodEndYn);

				TB_PR_1100MTDAO dao = new TB_PR_1100MTDAO();
				int result = dao.insert(dto);
				System.out.println("Insert result: " + result);
			}

		} else if ("update".equals(command)) {
			if ("1110".equals(type)) {
				// TB_PR_1110MTDTO 수정
				String itemNm = request.getParameter("itemNm");
				int trgProdCnt = Integer.parseInt(request.getParameter("trgProdCnt"));
				String prodStrtDt = request.getParameter("prodStrtDt");
				String prodEndDt = request.getParameter("prodEndDt");
				String mtMngCd = request.getParameter("mtMngCd");

				TB_PR_1110MTDTO dto = new TB_PR_1110MTDTO();
				dto.setITEM_NM(itemNm);
				dto.setTRG_PROD_CNT(trgProdCnt);
				dto.setPROD_STRT_DT(prodStrtDt);
				dto.setPROD_END_DT(prodEndDt);
				dto.setMT_MNG_CD(mtMngCd);

				TB_PR_1110MTDAO dao = new TB_PR_1110MTDAO();
				int result = dao.update(dto);
				System.out.println("Update result: " + result);
			} else if ("1100".equals(type)) {
				// TB_PR_1100MTDTO 수정
				String itemNm = request.getParameter("itemNm");
				String itemCd = request.getParameter("itemCd");
				String liunNm = request.getParameter("liunNm");
				String prodStrtTime = request.getParameter("prodStrtTime");
				String prodEndTime = request.getParameter("prodEndTime");
				int indcQntt = Integer.parseInt(request.getParameter("indcQntt"));
				int prodQntt = Integer.parseInt(request.getParameter("prodQntt"));
				String workNm = request.getParameter("workNm");
				String eqpmOprtSttsVal = request.getParameter("eqpmOprtSttsVal");
				String prodEndYn = request.getParameter("prodEndYn");

				TB_PR_1100MTDTO dto = new TB_PR_1100MTDTO();
				dto.setITEM_NM(itemNm);
				dto.setITEM_CD(itemCd);
				dto.setLIUN_NM(liunNm);
				dto.setPROD_STRT_TIME(prodStrtTime);
				dto.setPROD_END_TIME(prodEndTime);
				dto.setINDC_QNTT(indcQntt);
				dto.setPROD_QNTT(prodQntt);
				dto.setWORK_NM(workNm);
				dto.setEQPM_OPRT_STTS_VAL(eqpmOprtSttsVal);
				dto.setPROD_END_YN(prodEndYn);

				TB_PR_1100MTDAO dao = new TB_PR_1100MTDAO();
				int result = dao.update(dto);
				System.out.println("Update result: " + result);
			} else if ("complete".equals(command)) {
				if ("1100".equals(type)) {
					String prodEndYn = request.getParameter("prodEndYn");
					if (prodEndYn == null) {
						prodEndYn = "Y";
					}
					// TB_PR_1100MTDTO 수정
					String itemNm = request.getParameter("itemNm");
					String itemCd = request.getParameter("itemCd");
					String liunNm = request.getParameter("liunNm");
					String prodStrtTime = request.getParameter("prodStrtTime");
					String prodEndTime = request.getParameter("prodEndTime");
					int indcQntt = Integer.parseInt(request.getParameter("indcQntt"));
					int prodQntt = Integer.parseInt(request.getParameter("prodQntt"));
					String workNm = request.getParameter("workNm");
					String eqpmOprtSttsVal = request.getParameter("eqpmOprtSttsVal");

					TB_PR_1100MTDTO dto = new TB_PR_1100MTDTO();
					dto.setITEM_NM(itemNm);
					dto.setITEM_CD(itemCd);
					dto.setLIUN_NM(liunNm);
					dto.setPROD_STRT_TIME(prodStrtTime);
					dto.setPROD_END_TIME(prodEndTime);
					dto.setINDC_QNTT(indcQntt);
					dto.setPROD_QNTT(prodQntt);
					dto.setWORK_NM(workNm);
					dto.setEQPM_OPRT_STTS_VAL(eqpmOprtSttsVal);
					dto.setPROD_END_YN(prodEndYn);

					TB_PR_1100MTDAO dao = new TB_PR_1100MTDAO();
					int result = dao.update(dto);
					System.out.println("complete result: " + result);
				}

			}

			// 작업 후 리스트 페이지로 리다이렉트
			if ("1100".equals(type)) {
				response.sendRedirect("tb_pr_mt?type=1100");
			} else if ("1110".equals(type)) {
				response.sendRedirect("tb_pr_mt?type=1110");
			}
		}
	}
}