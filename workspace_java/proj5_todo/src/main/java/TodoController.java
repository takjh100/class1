

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/todo")
public class TodoController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TodoDAO todoDAO = new TodoDAO();
		List resultList = todoDAO.selectTodoList();
		
		request.setAttribute("resultList", resultList);
		
		String url = "/WEB-IMF/list.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String todo = request.getParameter("todo");
		System.out.println("todo : "+ todo);
		
		TodoDTO todoDTO = new TodoDTO();
		todoDTO.setTodo(todo);
		
		TodoDAO todoDAO = new TodoDAO();
		int result = todoDAO.insertTodo(todoDTO);
		System.out.println("result : "+ result);
		
		//포스트되서 DB로 보낸 후 다시 원래페이지로 가도록
		//sendRedirect는 get방식으로만 간다
		String url = "todo";
		response.sendRedirect(url);
		
		
	}
	

}
