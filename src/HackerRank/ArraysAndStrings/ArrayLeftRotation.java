package HackerRank.ArraysAndStrings;

import java.util.Scanner;

/**
 * Created by srnegi on 3/14/2017.
 */
public class ArrayLeftRotation {
  public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size: ");
    int size = sc.nextInt();
    System.out.println("Enter rotation: ");
    int rotation = sc.nextInt();
    int[] array = new int[size];

    System.out.println("Enter array: ");
    for(int i=0;i<size;i++){
      if(rotation>i){
        array[size-rotation+i] = sc.nextInt();
      }
      else{
        array[i-rotation] = sc.nextInt();

      }
    }
    for(int j=0; j<array.length;j++)
    {
      System.out.print(array[j]+ " ");
    }
  }
}
