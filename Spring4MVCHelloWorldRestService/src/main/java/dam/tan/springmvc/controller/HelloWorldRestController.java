package dam.tan.springmvc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dam.tan.springmvc.domain.Message;

@RestController
public class HelloWorldRestController {
	@RequestMapping("/")
	public String welcome() {//welcome page, non-rest
		return "Welcome to RestTemplate Example";
	}
	
	@RequestMapping("/hello/{player}")
	public Message getMessage(@PathVariable String player) {// REST endpoint
		Message msg = new Message(player, "Hello" + player);
		return msg;
	}
}
