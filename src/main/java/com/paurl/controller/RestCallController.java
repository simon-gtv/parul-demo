package com.paurl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paurl.service.ServiceLayer;

@RestController
public class RestCallController {

   @Autowired
   ServiceLayer service;

   @RequestMapping("/count/{max}")
   public List<String> greeting(@PathVariable("max") String max) {

      return service.doSomething(max);
   }

}
