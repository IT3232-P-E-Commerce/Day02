package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {
	@GetMapping("/msg")
	public String myMsg() {
		return "Hello springboot";
	}
	
	@GetMapping("/name")
	public String myMsg() {
		return "my name is springboot";
	}
}
