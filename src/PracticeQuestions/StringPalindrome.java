package PracticeQuestions;

/**
 * Created by srnegi on 3/12/2017.
 */
public class StringPalindrome {
  public static void main(String[] args) {
    String string = " aulua ";
    char[] str = string.toCharArray();
    System.out.println(palindromCheck(str));
  }
  public static boolean palindromCheck(char[] string){

    int i=0;
    int j= string.length -1;
    while(i<j){
      if(string[i]!=string[j]){
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}

