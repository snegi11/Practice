package PracticeQuestions;

/**
 * Created by srnegi on 3/12/2017.
 */
public class Fibonacci {
  public static void main(String[] args) {
    System.out.println("Recurssive: ");
    for(int i=1; i<=5;i++) {
      System.out.println(fibonacciRecurrsive(i));
    }
      System.out.println("Iterative: ");
      for(int i=1; i<=5;i++) {
      System.out.println(fibonacciIterative(i));
    }
  }

  public static int fibonacciRecurrsive(int number){
    if(number==1)
      return 0;
    else if(number==2)
      return 1;
     else return fibonacciRecurrsive(number-1) + fibonacciRecurrsive(number - 2);
  }

  public static int fibonacciIterative(int number){
    if(number==1)
      return 0;
    else if(number==2)
      return 1;

    int fibo1=0, fibo2=1, fibonnaci = 0;
    for(int i=3;i<=number;i++){
      fibonnaci = fibo1+fibo2;
      fibo1=fibo2;
      fibo2=fibonnaci;
    }
    return fibonnaci;
  }
}
