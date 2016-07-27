package com.paurl.service;

import static java.lang.Integer.parseInt;
import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {

   public List<Integer> countTo(String limit) {

      return range(1, parseInt(limit) + 1).mapToObj(Integer::new).collect(toList());
   }

   // Business logic
   public void doSomething(String parm) {

      System.out.println("value is: " + parm);
   }

}
