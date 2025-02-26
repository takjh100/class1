

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ip")
public class IpServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		// getRemoteAddr : ip주소를 가져오는 방법 중 하나 
		System.out.println("getRemoteAddr : " + request.getRemoteAddr());
		
		// getMethod : 접근 Method 확인
		System.out.println("getMethod : " + request.getMethod());
		
		// getRequestURL : 쿼리스트링을 제외한 주소 전체
		System.out.println("getRequestURL : " + request.getRequestURL());
		
		// getRequestURI : ip, port,쿼리스트링 제외한 주소
		System.out.println("getRequestURI : " + request.getRequestURI());
		
		// getContextPath : 프로젝트 구분하는 주소
		System.out.println("getContextPath : " + request.getContextPath());
	
		// getServletPath : 서블릿 주소
		System.out.println("getServletPath : " + request.getServletPath());
		
		// getQueryString : 쿼리스트링
		System.out.println("getQueryString : " + request.getQueryString());
		
    }
}
