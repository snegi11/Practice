package CTCI;

/**
 * Created by srnegi on 3/11/2017.
 */
public class TwoStringPermutationChar {

  public static void main(String[] args) {
    String test = "aba";
    String test1 = "aab";
    String test2 = "wxyz";
    String test3 = "xyz";

    System.out.println("The two strings are permutable: "+permutable(test,test1));
  }

  public static boolean permutable(String str1, String str2){
    if(str1.length()!=str2.length())return false;

    int[] letters = new int[128];
      for(int i=0; i<str1.length();i++){
        letters[str1.charAt(i)]++;
      }

    for (int i=0;i<str2.length();i++){
      letters[str2.charAt(i)]--;
      if(letters[str2.charAt(i)]<0){
        return false;
      }
    }

    return true;
  }
}
