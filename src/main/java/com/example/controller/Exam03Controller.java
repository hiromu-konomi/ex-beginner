package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex03")
public class Exam03Controller {
	
	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String index() {
		
		return "exam03";
	}
	
	@RequestMapping("/input")
	public String input(String price1, String price2, String price3) {

		int intPrice1 = Integer.parseInt(price1);
		int intPrice2 = Integer.parseInt(price2);
		int intPrice3 = Integer.parseInt(price3);
		
		int sum = intPrice1 + intPrice2 + intPrice3;
		int allPrice = (int)(sum * 1.08);
		
		application.setAttribute("sum", sum);
		application.setAttribute("allPrice", allPrice);
		
		return "exam03-result";
	}
}
