package com.paurl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InitController {
	
	 @RequestMapping(value = "/abc", method = RequestMethod.GET, produces = "application/json")
	 public ModelAndView init() {
		 System.out.println("hit received");
		 return null;
	 }
//	 @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json" )
	 @RequestMapping(value = "ajax/test.do", method = RequestMethod.GET, produces = "application/json")
	 public ModelAndView  index(){
		System.out.println("fizzzzzz");
		 return null;
		
	 }
	 
	 @RequestMapping("/greeting")
	    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
	        model.addAttribute("name", name);
	        System.out.println("test greet");
	        return "greeting";
	    }
	 

}
