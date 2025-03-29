package kr.or.human.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpController {

	@RequestMapping(value="/emp", method=RequestMethod.GET)
	public String listEmp() {
		List<EmpDTO> list = empService.getEmpList();
		System.out.println("list.size : "+list.size());
		return "emp";
		
	}
	
}
