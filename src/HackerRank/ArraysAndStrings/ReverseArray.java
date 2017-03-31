package HackerRank.ArraysAndStrings;

/**
 * Created by srnegi on 3/14/2017.
 */

//Print all N integers in  in reverse order as a single line of space-separated integers.

import java.util.Scanner;

public class ReverseArray {

  public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named ReverseArray. */
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size: ");
    int number = sc.nextInt();
    System.out.println("Enter numbers: ");
    int[] array = new int[number];
    for(int i=0;i<array.length;i++){
    array[i] =sc.nextInt();
    }

    reverseArray(array);

    System.out.println("Output: ");
    for(int i=0; i<array.length; i++){
     System.out.println(array[i]);
    }}

    public static int[] reverseArray(int[] newArray){

      int i = 0, j = newArray.length-1;
      int temp;
      while(j>i){
        temp = newArray[i];
        newArray[i] = newArray[j];
        newArray[j] =temp;
        i++;
        j--;
      }
      return newArray;
    }
  }

