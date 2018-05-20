package com.bravetank.springmvc.library;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/borrower")
public class BorrowerController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//create a borrower object
		Borrower theBorrower = new Borrower();
		
		//add borrower object to the model
		theModel.addAttribute("borrower", theBorrower);
		
		return "borrower-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("borrower") Borrower theBorrower)
	{
		
			return "borrower-welcome";
			
		}
   }
