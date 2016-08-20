package com.learnmvc.spring;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.learnmvc.spring.Login;

/**
 * Handles requests for the application home page.
 */
@Controller
//@RequestMapping("login")
public class HomeController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String init(Model model) {
		Login login = new Login();
		model.addAttribute("login",login);
		
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String submit(Model model, @ModelAttribute("login") Login login)
	{
		System.out.println("Anit:DebugLocation 1");
		if (login != null && login.getUserName() != null & login.getPassword() != null) {
			System.out.println("Anit:DebugLocation 1.1");
			if (login.getUserName().equals("abc") && login.getPassword().equals("xyz")) {
				System.out.println("Anit:DebugLocation 2");
				model.addAttribute("msg", login.getUserName());
				System.out.println("Anit:DebugLocation 3");
				return "success";
				
			} else {
				model.addAttribute("error", "Invalid Details");
				return "login";
			}
		}
		else {
			model.addAttribute("error", "Please enter Details");
			return "login";
		}
	}
	
	/*
	@RequestMapping(method = RequestMethod.GET)
	public String click(Model model, @ModelAttribute("success") Book book)
	{
		System.out.println("Anit:DebugLocation A");
		book = new Book("1000", "Java Book","richard",1050);
	
		
		return "book";
	}
	*/

}
