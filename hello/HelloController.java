package com.example.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController							//Annotation for Rest Controller
public class HelloController {

	@RequestMapping("/hello")			//Annotation for Request from web
	public String sayHi() {
		return "Hi";
	}
	
}
