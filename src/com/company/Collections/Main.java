package com.company.Collections;

/**
 * Created by srnegi on 2/27/2017.
 */
public class Main {
  public static void main(String[] args) {
    Theatre theatre = new Theatre("Olympian", 8,12);
    theatre.getSeats();
    if(theatre.reserveSeat("H11")){

      System.out.println("Print pay");
    }
    else{
      System.out.println("Sorry, seat is taken!");
    }
    if(theatre.reserveSeat("H11")){

      System.out.println("Print pay");
    }
    else{
      System.out.println("Sorry, seat is taken!");
    }
  }


}
