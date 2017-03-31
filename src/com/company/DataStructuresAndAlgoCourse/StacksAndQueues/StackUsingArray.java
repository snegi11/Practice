package com.company.DataStructuresAndAlgoCourse.StacksAndQueues;

/**
 * Created by srnegi on 3/24/2017.
 */
public class StackUsingArray {

  private int[] stack;
  private int size; //to keep track
//static means every instance does not create size but using same value
  private static final int INITIAL_SIZE = 10;


  public StackUsingArray(){
    stack = new int[INITIAL_SIZE];
    size=0; //current index
  }

  public void push(int value){
    if(size == stack.length){
      doubleCapacity();
    }

    stack[size] = value;
    size++;
  }

  public int pop(){
    if(size == 0){
      throw new ArrayIndexOutOfBoundsException();
    }

    int result = stack[size-1];
    stack[size - 1] = 0; //clear out old value
    size--;

    return result;
  }

  public int peek(){
    if(size == 0){
      throw new ArrayIndexOutOfBoundsException();
    }

    int result = stack[size-1];
    return result;

  }

  public int size(){
    return size;
  }

  public int capacity(){
    return stack.length;
  }

  public int capacaityRemaining(){
    int result = stack.length - size;
    return result;
  }

  public void empty(){
    for(int i=0;i <stack.length;i++){
      stack[i] = 0;
    }
  size = 0;
  }

  //compress so that there are no unused cell in the array
  public void compress(){
    if(size<stack.length) {
      int newCapacity = size;
      int[] newStack = new int[newCapacity];

      for (int i = 0; i < stack.length; i++) {
        newStack[i] = stack[i];
      }
      stack = newStack;
      }
    }

  //this will create a new array - twice as big as the old one
  private void doubleCapacity(){
    int newCapacity = 2*stack.length;
    int[] newStack = new int[newCapacity];

    for(int i=0; i<stack.length; i++){
      newStack[i] = stack[i];
    }
    stack = newStack;
  }

  public static void main(String[] args) {
    StackUsingArray myStack = new StackUsingArray();
    myStack.push(3);
    myStack.push(5);
    myStack.push(6);
    myStack.push(8);

    System.out.println("Is this 2?" +myStack.pop());

  }

}
