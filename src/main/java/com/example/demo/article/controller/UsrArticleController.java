package com.example.demo.article.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrArticleController {
	@RequestMapping("/user/home/main")
	@ResponseBody
	public String showMain() {
		return "¼¼ÆÃ ³¡";
	}
}
