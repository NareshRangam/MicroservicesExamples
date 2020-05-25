package com.ss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloud")
public class CompanyController {
@GetMapping("/test")
	public String getCompanyEmployees() {
	
		return "cloud config working....";
	}

}
