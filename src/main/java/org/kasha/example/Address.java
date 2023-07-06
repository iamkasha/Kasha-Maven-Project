package org.kasha.example;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String city ="texas";
    private String state ="us";

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getAddress(){
        return city + " " + state;
    }

}
