package com.alugagem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(){
		return "hello-world";
	}
	
	@RequestMapping("/hello")
	public ModelAndView hello(String nome){
		ModelAndView mv = new ModelAndView("hello-world");
		mv.addObject("nome",nome);
		return mv;
	}
}
