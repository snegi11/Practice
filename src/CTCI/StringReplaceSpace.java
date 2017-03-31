package CTCI;

import java.util.ArrayList;

/**
 * Created by srnegi on 3/11/2017.
 */
public class StringReplaceSpace {

  public static void main(String[] args) {
    String test = "How are you";

   System.out.println("Method 1: "+replaceString(test));
   System.out.println("Method 2: "+replaceString2(test));
   System.out.println("Method 3: "+replaceString3("Mr John Smith    ", 13));
  }

  public static String replaceString(String str){
    return str.replace(" ","%20");
  }

  public static String replaceString2(String str){

    String[] words = str.split(" ");
    StringBuilder sentence = new StringBuilder(words[0]);

    for(int i=1; i<words.length;i++){
      sentence.append("%20");
      sentence.append(words[i]);
    }
    return sentence.toString();
  }

  public static String replaceString3(String str, int length){

    char[] characterArray = str.toCharArray();

    ArrayList<Character> arrayList = new ArrayList<Character>();
      for(int i=0;i<length;i++){
        if(characterArray[i]==' '){
          arrayList.add('%');
          arrayList.add('0');
          arrayList.add('2');
        }
        else{
          arrayList.add(characterArray[i]);
        }
      }
    return arrayList.toString().replace("[", "").replace("]", "").replace(",", "");
  }
}
