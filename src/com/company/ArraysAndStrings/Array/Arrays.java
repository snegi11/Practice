package com.company.ArraysAndStrings.Array;

//Take input of array from users and return the average:
import java.util.Scanner;

public class Arrays {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {

    int[] myArray = getIntegers(3);
    for (int i = 0; i < myArray.length; i++) {
      System.out.println(myArray[i]);
    }
    System.out.println("The average is "+ avg(myArray));
  }

  public static int[] getIntegers(int number){
    int[] values = new int[number];
    System.out.println("Enter any "+number+ " numbers. \r");
    for(int i =0 ;i < values.length; i++){
      values[i] = scanner.nextInt();
    }
    return values;
  }

  public static double avg(int[] array){
    int sum =0;
    for(int i =0 ;i < array.length; i++){
      sum += array[i];
    }
    return (double) sum / (double) array.length;

  }

}
