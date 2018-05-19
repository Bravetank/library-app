package com.bravetank.springmvc.library;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LibraryApplicationController {
	
	//need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "library-form";
	}
	
	//need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm
		(@RequestParam ("customerName") String theName,
		Model model) {
		//The model is the container to store your form data. It starts out empty.
		
		//Check if name == Michelle
		if (theName.equalsIgnoreCase("Michelle")){
			System.out.println("You have already registered");
			return "registration-error";
			

			//Happy Path 
		} else {
			//add to model (key & value)
			model.addAttribute("name", theName);
			
			return "library-welcome";
			
		}
   }
}