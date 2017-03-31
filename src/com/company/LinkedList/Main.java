package com.company.LinkedList;

import java.util.ArrayList;

/**
 * Created by srnegi on 2/14/2017.
 */
public class Main {

  public static void main(String[] args){
//    Customer customer = new Customer("Tim", 54.96);
//    Customer anotherCustomer;
//    anotherCustomer = customer;
//    anotherCustomer.setBalance(12.18);
//      System.out.println("Balance for customer"
//      +customer.getName() +" is " +customer.getBalance());
//  }//this outputs Tim , 12.18

  //why does changing balance of second class
  //change the balance of first class?
  //when you do the assignment on 11!
  //there is only one class that is the customer class and the other class
  //anotherCustomer actually points to the first class so updating the second one actually updates the first
 //this is because of memory allocation in java and java does not let you use pointers!
  //So this is important to understand what linked list is and its advantage over an array

    Customer customer = new Customer("Tim", 54.96);
    Customer anotherCustomer;
    anotherCustomer = customer;
    anotherCustomer.setBalance(12.18);
      System.out.println("Balance for customer"
      +customer.getName() +" is " +customer.getBalance());

    ArrayList<Integer> intList = new ArrayList<>();
    intList.add(1);
    intList.add(3);
    intList.add(4);

    for(int i=0; i<intList.size();i++){
      System.out.println(i + ": " +intList.get(i));
     }

    intList.add(1,2);

    for(int i=0; i<intList.size();i++){
      System.out.println(i + ": " +intList.get(i));
    }

  }


  }
