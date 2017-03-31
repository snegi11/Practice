package com.company.DataStructuresAndAlgoCourse.ArraysAndStrings;

import java.util.Arrays;

/**
 * Created by srnegi on 2/19/2017.
 */
public class SelectionSortAlgo {
public static void main(String[] args){
  int[] array = {100, 20, 10, 40, 80, 600, 500};

  for(int i =0; i<array.length;i++){
    int minimumIndex = i;

    for(int j=i+1;j<array.length-1;j++){
     if(array[j]<array[minimumIndex])
     {
       minimumIndex = j;

      }
     }
    int temp = array[minimumIndex];
    array[minimumIndex] = array[i];
    array[i] = temp;
    }
    System.out.println(Arrays.toString(array));
  }
}
