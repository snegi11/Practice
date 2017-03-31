package CTCI;

/**
 * Created by srnegi on 3/11/2017.
 */

//this is one approach and the other involves bit vector - yet to learn

public class AllUniqueChars {
  public static void main(String[] args) {
    String test = "abcdef893214";
    String test1 = "abccba12323";
    String test2 = "ngfhswer ";
    String test3 = "";

    System.out.println(uniqueCharacters(test));
    System.out.println(uniqueCharacters(test1));
    System.out.println(uniqueCharacters(test2));
    System.out.println(uniqueCharacters(test3));

  }

  public static boolean uniqueCharacters(String str){

    boolean[] char_set = new boolean[128];
    if(str.length()>128) return false;

    for(int i=0; i<str.length(); i++) {
      int val = str.charAt(i);
      if(char_set[val]){
        return false;
      }
      char_set[val] = true;
    }
  return true;
  }
}
