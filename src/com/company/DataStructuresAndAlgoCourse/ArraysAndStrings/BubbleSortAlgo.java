package com.company.DataStructuresAndAlgoCourse.ArraysAndStrings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by srnegi on 2/19/2017.
 */
public class BubbleSortAlgo {

  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int[] array = new int[5];
    int temp;
    System.out.println("Enter 5 numbers for sorting");
    for(int num=0;num<5;num++){
      array[num] = sc.nextInt();
    }
    System.out.println("Before Bubble Sort: " + Arrays.toString(array));
    for(int i=0;i<array.length-1;i++){
     for(int j=0;j<array.length-i-1;j++){
      if(array[j]>array[j+1]) {
        temp = array[j+1];
        array[j+1] = array[j];
        array[j] = temp;
      }
    }
  }
  System.out.print("After Bubble Sort: " + Arrays.toString(array));
  }

}
