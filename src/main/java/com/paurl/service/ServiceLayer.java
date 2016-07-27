/*package com.paurl.Service;

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

}*/
package com.paurl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {

   // Business logic
   public List<String> doSomething(String parm) {

      List<String> list = new ArrayList<>();
      for (int i = 1; i <= Integer.parseInt(parm); i++) {
         if (i % 3 == 0 && i % 5 == 0) {
            list.add("fizz buzz");
         } else if (i % 3 == 0) {
            list.add("fizz");
         } else if (i % 5 == 0) {
            list.add("buzz");
         } else {
            list.add(i + "");
         }

      }

      System.out.println("value is: " + parm);
      return list;
   }

}