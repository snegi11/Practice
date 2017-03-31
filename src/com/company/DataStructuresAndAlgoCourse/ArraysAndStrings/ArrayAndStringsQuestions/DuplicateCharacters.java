package com.company.DataStructuresAndAlgoCourse.ArraysAndStrings.ArrayAndStringsQuestions;

/**
 * Created by srnegi on 3/18/2017.
 */

/* 2.Write an algorithm which checks if there are duplicate characters in a string.
The method signature would look something like public boolean hasDuplicateChars(String s).
If we pass "anaconda" the method should return true (repeated char 'a').
If we pass 'great', the method should return false,
because there are no duplicate characters in the string.
What is the time complexity of this algorithm? If we know that the string contains
ONLY ASCII characters, can we improve the algorithm?
*/

public class DuplicateCharacters {
  public static void main(String[] args) {
    String str1 = "abccba";
    String str2 = "abc";

    System.out.println("DuplicateCharacters: " + hasDuplicateCharacters(str2));
  }

  public static boolean hasDuplicateCharacters(String string){
    boolean[] char_set = new boolean[128];
    if(string.length()>128){
      return false;
    }

    for(int i=0;i<string.length();i++){
      int val = string.charAt(i);
      if(char_set[val]) {
        return true;
      }
      char_set[val]= true;
    }
    return false;
  }
}
