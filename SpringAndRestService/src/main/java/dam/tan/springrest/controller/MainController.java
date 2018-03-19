package dam.tan.springrest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dam.tan.springrest.model.Message;

@RestController
public class MainController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public Message welcome(@RequestParam("name") String name) {
		Message msg = new Message(name, "Hello "+name);
		return msg;
	}
	
	@RequestMapping("/hello/{name}")
	public Message welcomeAgain(@PathVariable("name") String name) {
		Message msg = new Message(name, "Hello "+name);
		return msg;
	}
}
