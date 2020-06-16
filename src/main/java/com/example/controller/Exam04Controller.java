package com.example.controller;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.UserForm;

@Controller
@RequestMapping("/ex04")
public class Exam04Controller {
	
	@ModelAttribute
	public UserForm setUserForm() {
		return new UserForm();
	}

	@RequestMapping("")
	public String index() {
		return "exam04";
	}
	
	@RequestMapping("/input")
	public String input(User user, Model model) {
		model.addAttribute("user", user);
		return "exam04-result";
	}
}
