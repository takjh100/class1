package kr.or.human.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.human.dto.EmpDTO;
import kr.or.human.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	EmpService empService;

	@RequestMapping(value="/emp", method=RequestMethod.GET)
	public String listEmp(Model model) {
		List<EmpDTO> list = empService.getEmpList();
		System.out.println("list.size : "+ list.size());
		model.addAttribute("list", list);
		return "emp";
	}
	
	@RequestMapping(value="/empOne", method=RequestMethod.GET)
	public String EmpOne() {
		EmpDTO dto = empService.getEmpOne();
		System.out.println("controller dto : "+ dto);
		return "emp";
	}

	@RequestMapping(value="/empno", method=RequestMethod.GET)
	public String empno(
			@RequestParam("empno")
			int empno
		) {
		EmpDTO dto = empService.getEmpno(empno);
		System.out.println("controller dto : "+ dto);
		return "emp";
	}
	
	

	@RequestMapping(value="/detailEmp", method=RequestMethod.GET)
	public String empno2(
			@ModelAttribute
			EmpDTO empDTO,
			
			Model model 
			) {
		EmpDTO dto = empService.getEmpno2(empDTO);
		System.out.println("controller empDTO : "+ dto);
		model.addAttribute("dto", dto);
		return "detailEmp";
	}
	
	@RequestMapping(value="/modifyEmp", method=RequestMethod.GET)
	public String modifyEmp(
			@ModelAttribute
			EmpDTO empDTO,
			
			Model model 
			) {
		EmpDTO dto = empService.getEmpno2(empDTO);
		model.addAttribute("dto", dto);
		return "modifyEmp";
	}
	
//	@RequestMapping(value="/emp", method=RequestMethod.PUT)
//	public String modifyEmp(Model model) {
//		// 실제로 update 할 곳
//	}
	
	
}