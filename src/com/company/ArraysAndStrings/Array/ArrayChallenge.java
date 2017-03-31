package com.company.ArraysAndStrings.Array;

import java.util.Scanner;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

public class ArrayChallenge{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){

    System.out.println("Enter the size of array: ");
    int inputSize = sc.nextInt();
    int[] myArray = getIntegers(inputSize);
    int[] sorted = sortArray(myArray);
    printArray(sorted);
  }

  public static int[] getIntegers(int number){
    int[] values = new int[number];
    System.out.println("Enter array elements. \r");
    for(int i=0; i<values.length;i++){
      values[i] = sc.nextInt();
    }
    return values;
  }

  public static void printArray(int[] finalArray){
    for(int i=0;i<finalArray.length;i++){
      System.out.println(finalArray[i]);
    }
  }

  public static int[] sortArray(int[] myArray){
    int[] sortedArray = new int[myArray.length];
    for(int i=0;i<myArray.length;i++){
      sortedArray[i] = myArray[i];
    }
    int temp;
    boolean flag = true;
    while(flag){
      flag = false;
      for(int i=0;i<sortedArray.length-1;i++){
        if(sortedArray[i]<sortedArray[i+1]){
          temp = sortedArray[i];
          sortedArray[i] = sortedArray[i+1];
          sortedArray[i+1] = temp;
          flag= true;
        }
      }

    }
    return sortedArray;
  }
}
