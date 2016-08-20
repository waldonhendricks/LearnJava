
package com.learnmvc.spring;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.learnmvc.spring.Success;


@Controller
//@RequestMapping("book")
public class BookController{
	
	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String click(Model model, @ModelAttribute("success") Success success)
	{
		
		System.out.println("Anit:DebugLocation A");
		success = new Success("1000", "Java Book","richard","1050");
		/*
		List<Book> books = new ArrayList<Book>();
	    books.add(new Book("1000", "Java Book","richard",1050));
	    books.add(new Book("2000", "python book","david",500));
	    books.add(new Book("3000", "C++ Book","dan",2300));
	    books.add(new Book("4000", "C# Book","michael",1400));
	    books.add(new Book("5000", "JSP Book","williams",320));
		*/
		
		return "final";
	}

}