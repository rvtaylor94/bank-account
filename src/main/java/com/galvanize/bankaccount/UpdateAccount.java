package com.galvanize.bankaccount;

public class UpdateAccount {
    private String name;
    private Double balance;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public UpdateAccount(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }
}
