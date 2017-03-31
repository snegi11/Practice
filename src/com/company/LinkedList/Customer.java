package com.company.LinkedList;

/**
 * Created by srnegi on 2/14/2017.
 */
public class Customer {
  private String name;

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

  private Double balance;

  public Customer(String name, Double balance) {
    this.name = name;
    this.balance = balance;
  }


}
