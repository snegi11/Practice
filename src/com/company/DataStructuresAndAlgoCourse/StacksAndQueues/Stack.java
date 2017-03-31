package com.company.DataStructuresAndAlgoCourse.StacksAndQueues;

/**
 * Created by srnegi on 3/24/2017.
 */
public class Stack {

  int maxSize;
  int top;
  String arr[];


  public Stack(int n){

    maxSize = n;
    arr = new String[maxSize];
    top = 0;

  }

  public boolean empty(){

  }

  public void push(String str)
  {
    if(top < maxSize) {
      arr[top] = str;
      top++;
    }
    else
    {
      System.out.println("Stack overflow");
    }
  }

  public String pop(){


  }

  public String peek(){


  }


}
