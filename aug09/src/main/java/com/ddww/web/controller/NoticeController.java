package com.ddww.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoticeController {

	@GetMapping("/notice")
	public String index() {
		return "notice";
	}
}
