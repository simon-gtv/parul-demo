package com.paurl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.paurl.service.ServiceLayer;

@Controller
public class InitController {

   @Autowired
   private ServiceLayer service;

   @RequestMapping("/greeting")
   public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
         Model model) {

      model.addAttribute("name", name);
      service.doSomething(name);
      return "greeting";
   }

   // @RequestMapping(value = "/test", method = RequestMethod.GET, produces =
   // "application/json" )
   @RequestMapping(value = "ajax/test.do", method = RequestMethod.GET, produces = "application/json")
   public ModelAndView index() {

      System.out.println("fizzzzzz");
      return null;

   }

   @RequestMapping(value = "/abc", method = RequestMethod.GET, produces = "application/json")
   public ModelAndView init() {

      System.out.println("hit received");
      return null;
   }

   @RequestMapping(value = "/greeting", method = RequestMethod.POST)
   public String simpleInput(@RequestParam(value = "inputId", required = true) String inputId, Model model) {

      service.doSomething(inputId);
      return "thank-you";
   }
}
