package com.company.DataStructuresAndAlgoCourse.ArraysAndStrings;

import java.util.Arrays;

/**
 * Created by srnegi on 2/19/2017.
 */
public class InsertionSortAlgo {
  public static void main(String[] args){
    int[] array= {20,100,90,23,46,80};

  for(int i=0;i<array.length;i++){
    int current = array[i];
    int j = i-1;
    while(j>=0 && array[j]>current){
      array[j+1]=array[j];
      j=j-1;
    }
    array[j+1] = current;
  }

    System.out.println(Arrays.toString(array));
  }
}
