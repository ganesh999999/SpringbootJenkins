package com.springboot.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsTestController {
	@GetMapping
	public String returnString() {
		return "Jenkins app is working fine";
	}
}
