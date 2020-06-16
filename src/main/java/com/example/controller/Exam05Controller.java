package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.MemberService;

@Controller
@RequestMapping("/ex05")
public class Exam05Controller {

	@Autowired
	private MemberService service;
	
	@RequestMapping("/input-form")
	public String input(String name) {
		service.findBy(name).forEach(System.out::println);
		return "exam05-result";
	}
}
