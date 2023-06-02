package com.trial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
		@GetMapping("/Ramji")
		public String Ramji() {
			return "hello";
		}
		
		@ResponseBody
		@GetMapping("/hello")
		
		public String hello() {
			return "hello";
		}
		
		@ResponseBody
		@GetMapping("hi")
		public String hi() {
			return "hi there got a security";
		}
		

}
