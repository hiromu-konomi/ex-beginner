package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex02")
public class Exam02Controller {

	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index() {
		return "exam02";
	}
	
	@RequestMapping("/input")
	public String input(String num1, String num2) {
		int num1Int = Integer.parseInt(num1);
		int num2Int = Integer.parseInt(num2);
		String answer = String.valueOf(num1Int + num2Int); 
		
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("answer", answer);
		
		return "exam02-result";
	}
	
	@RequestMapping("/result")
	public String result() {
		return "exam02-result2";
	}
//	
//	@RequestMapping("/result2")
//	public String result2() {
//		return "exam02-result2";
//	}
}
