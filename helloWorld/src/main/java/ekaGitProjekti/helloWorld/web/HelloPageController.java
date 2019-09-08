package ekaGitProjekti.helloWorld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody

public class HelloPageController {
	
	@RequestMapping("/index")
	public String showMainPage() {
		return "Hello World!";
		
	}

}
