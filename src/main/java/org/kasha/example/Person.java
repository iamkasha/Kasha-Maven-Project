package org.kasha.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    private Account acc;
    @Autowired
    private Address addr;


 public String getDetails(){
     return " " + acc.getAccount("123", "savings") + " " + addr.getAddress();
 }

}
