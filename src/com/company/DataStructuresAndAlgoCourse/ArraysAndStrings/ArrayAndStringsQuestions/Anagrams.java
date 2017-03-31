package com.company.DataStructuresAndAlgoCourse.ArraysAndStrings.ArrayAndStringsQuestions;

/**
 * Created by srnegi on 3/18/2017.
 */

/* 3.Write an algorithm that takes two strings and returns a boolean value indicating
if the strings are anagrams. If you don't know what an anagram is,
search for the word (not the algorithm) online. What is the time complexity of this algorithm?
*/

public class Anagrams {

  public static void main(String[] args) {
    String string1 = "abc";
    String string2 = "baa";

    System.out.println("Anagrams: " +anagram(string1, string2));
  }

  public static boolean anagram(String str1, String str2){
    if(str1.length()!=str2.length()){
      return false;
    }

    int[] letters = new int[128];

    for(int i=0;i<str1.length();i++){
      letters[str1.charAt(i)]++;
    }

    for(int j=0;j<str2.length();j++){
      letters[str2.charAt(j)]--;
      if(letters[str2.charAt(j)]<0){
      return false;
      }
    }

    return  true;
  }


}
