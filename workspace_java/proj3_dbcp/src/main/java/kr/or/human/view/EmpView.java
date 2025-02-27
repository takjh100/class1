package kr.or.human.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import kr.or.human.dto.EmpDTO;

public class EmpView {

	public void viewEmp(List<EmpDTO> list, HttpServletResponse response) {
		System.out.println("EmpView viewEmp 실행");
		
		PrintWriter out;
		try {
			out = response.getWriter();

			for (int i = 0; i < list.size(); i++) {
				EmpDTO e = list.get(i);
				out.print(e.getEmpno() + " ");
				out.print(e.getEname() + " ");
				out.println(e.getHiredate());
			}

		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
}
