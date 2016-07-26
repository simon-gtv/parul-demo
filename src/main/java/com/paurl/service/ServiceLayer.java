package com.paurl.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {

   // Business logic
   public void doSomething(String parm) {

      System.out.println("value is: " + parm);
   }

}
