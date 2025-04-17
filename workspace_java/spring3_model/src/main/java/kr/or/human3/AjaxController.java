package kr.or.human3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	@RequestMapping("/ajax.do")
	public String ajax() {
		return "ajax";
	}

	@RequestMapping("/ajax1")
	public String ajax1(
//			@RequestParam("id") // json으로 보낸건
								// @RequestParam 이나 request.getParameter로 받을 수 없다
			@RequestBody
			MemberDTO dto
	) {
		
		System.out.println("id : "+ dto.getId());
		
		return "ajax";
	}

	@RequestMapping("/ajax2")
	@ResponseBody //리턴을 글씨로 보냄 뷰리졸버를 타지않게한다
	public String ajax2(
			@RequestBody
			MemberDTO dto
			) {
		
		System.out.println("id : "+ dto.getId());
		
		return "ajax";
	}

	@RequestMapping("/ajax3")
	@ResponseBody
	public MemberDTO ajax3(
			@RequestBody
			MemberDTO dto
	) {
		
		System.out.println("id : "+ dto.getId());
		
		return dto;
	}
	
	@RequestMapping("/ajax4")
	@ResponseBody
	public List ajax4(
			@RequestBody //JSON.parse()해준다
			MemberDTO dto
			) {
		
		List list = new ArrayList();
		list.add(dto);
		list.add(dto);
		list.add(dto);
		
		System.out.println("list : "+ list);
		
		return list;
	}
	
	
}
