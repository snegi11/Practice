package CTCI;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by srnegi on 3/11/2017.
 */
public class AllUniqueCharsWithSet {

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

  public static boolean uniqueCharacters(String toTest) {
    Set<Character> set = new HashSet();
    for(char c: toTest.toCharArray()){
      if(set.contains(c)){
        return false;
      }
      set.add(c);
    }
    return true;
  }
}
