package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//need a controller to show initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//need a new controller to read form data add data to the model object
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read the parameter from the HTML form
		String name = request.getParameter("studentName");
		
		//convert the data to all CAPS
		name = name.toUpperCase();
		
		//create message
		name = "Yo! " + name; 
		
		//add mssage to the model
		model.addAttribute("message", name);
		
		return "helloworld";
	}
}
