package kr.or.human3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AjaxController {

	@RequestMapping("ajax.do")
	public String ajax() {
		return "ajax";
	}
	
	
}
