package HackerRank.ArraysAndStrings;

import java.util.Scanner;

/**
 * Created by srnegi on 3/14/2017.
 */
public class TwoDArrayHourGlass {
  public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int max = Integer.MIN_VALUE;
    int temp;
    int[][] array = new int[6][6];
    for(int i=0; i<6; i++){
      for(int j=0; j<6; j++){
        array[i][j] = sc.nextInt();
      }
    }
    for(int i=0;i<4;i++){
      for(int j=0;j<4;j++){
        temp = array[i][j] + array[i][j+1] + array[i][j+2]
          + array[i+1][j+1]
          + array[i+2][j] + array[i+2][j+1] + array[i+2][j+2];
        max = Math.max(temp,max);
      }
    }
    System.out.println(max);
  }
}
