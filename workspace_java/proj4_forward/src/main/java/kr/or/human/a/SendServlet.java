package kr.or.human.a;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/send")
public class SendServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("/send doGet 실행");
		
		//http 주소에서 text 값을 가져오는 코드
		String text = request.getParameter("text");
		System.out.println("text : "+ text);
		
		// 응답으로 가야할 곳을 알려준다
		// 클라이언트가 해당 주소로 이동해줌
		// 즉, 응답을 받았으니까 접속을 끊고
		// 새로운 주소로 다시 접속하는걸 자동으로 해줌
		response.sendRedirect("another?text="+text);
//		response.sendRedirect("another");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/send doPost 실행");
		
		String text = request.getParameter("text");
		System.out.println("text : "+ text);
		
		response.sendRedirect("another?text="+text);
	
	}

}
