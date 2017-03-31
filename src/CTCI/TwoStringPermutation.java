package CTCI;

import java.util.Arrays;

/**
 * Created by srnegi on 3/11/2017.
 */
public class TwoStringPermutation {
  public static void main(String[] args) {
    String test = "abcd";
    String test1 = "dcba";
    String test2 = "wxyz";
    String test3 = "xyz";

    System.out.println("The two strings are permutable: "+permutable(test,test1));
  }

  public static boolean permutable(String str1, String str2){

    if(str1.length()!=str2.length()) return false;


    char[] a = str1.toCharArray();
    char[] b =str2.toCharArray();

    Arrays.sort(a);
    Arrays.sort(b);

    return Arrays.equals(a,b);
  }

}
