package PracticeQuestions;

/**
 * Created by srnegi on 3/12/2017.
 */

public class ReverseString {
  public static void main(String[] args) {
    String string = "srishti negi here you are!";
    char[] str = string.toCharArray();
    System.out.println(StringReverse(str));
  }
  public static String StringReverse(char[] string){

    int begin=0;
    int end= string.length-1;
    char temp;
    while(end>begin) {
      temp = string[begin];
      string[begin] = string[end];
      string[end] = temp;
      end--;
      begin++;
    }
    return new String(string);
  }
}
