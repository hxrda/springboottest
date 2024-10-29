package com.example.testSWP1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller 
@ResponseBody 
public class TestSwp1Controller {

	@RequestMapping("*") 
	public String hello() {
		return "Hello Spring";
	}
	
	//next: type "http://localhost:8080/" to web search bar (non-parametric)
	}
	//
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	//







