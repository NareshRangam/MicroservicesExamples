package com.ss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class UserController {
	@GetMapping("/employees")
	public String getEmployeeName()
	{
		return "Naresh";
	}

}
