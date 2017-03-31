package com.company.ArraysAndStrings.Array;

/**
 * Created by srnegi on 1/29/2017.
 */
//Arrays is a data structure that allows you to store sequence of value of the same type.
//You can create an array of integers, an array of characters and strings etc.
//This works for all primitive types
public class Main {

  public static void main(String[] args) {

    int[] myIntArray = new int[10];
    for (int i = 0; i < myIntArray.length; i++) {
      myIntArray[i] = i * 10;
    }

  printArray(myIntArray);
  }

   public static void printArray(int[] array){
    for(int i=0; i<array.length; i++){
      System.out.println("Element "+i+" of array is: "+array[i]);
      //System.out.println(myIntArray);
    }
  }
}
