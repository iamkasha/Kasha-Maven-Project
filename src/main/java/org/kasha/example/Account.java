package org.kasha.example;

import org.springframework.stereotype.Component;

@Component
public class Account {
    private String accountNumber;
    private String accountType;

    public Account(String accountNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public String getAccount(String accNo, String accType){
        return accNo + " " + accType;
    }

}
