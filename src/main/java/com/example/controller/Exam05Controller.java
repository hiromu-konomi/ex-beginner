package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.MemberService;

@Controller
@RequestMapping("/ex05")
public class Exam05Controller {

	@Autowired
	private MemberService service;
	
	@RequestMapping("")
	public String index() {
		return "exam05";
	}
	
	@RequestMapping("/input-form")
	public String input(String name, Model model) {
		model.addAttribute("memberList", service.findBy(name));
		return "exam05-result";
	}
}
