package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request, Model model) {
		//The model is the container to store your form data. It starts out empty.
		//Do some validation before passing data to the View
		
		//read the request parameter from the HTML form
		String theName = request.getParameter("customerName");
		String stringAge = request.getParameter("customerAge");
		int theAge = Integer.parseInt(stringAge);
		
		//Check if name == Michelle
		if (theName.equalsIgnoreCase("Michelle")){
			System.out.println("You have already registered");
			return "registrationError";
			
		//Check if age is under 21
		} else if (theAge < 21) {
			return "registrationError";
			
			//Happy Path 
		} else {
			//add to model (key & value)
			model.addAttribute("name", theName);
			model.addAttribute("age", theAge);
			
			
			return "helloworld";
			
		}
   }
}