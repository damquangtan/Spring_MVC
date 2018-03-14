package dam.tan.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHelloWorld(ModelMap model) {
		model.addAttribute("greeting", "Hello World!");
		return "hello";
	}
	
	@RequestMapping(value = "helloagain", method = RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {
		model.addAttribute("greeting", "Hello World Again!");
		return "hello";
	}
}
