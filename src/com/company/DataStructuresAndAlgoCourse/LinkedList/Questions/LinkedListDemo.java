package com.company.DataStructuresAndAlgoCourse.LinkedList.Questions;

/**
 * Created by srnegi on 3/19/2017.
 */
public class LinkedListDemo {

  public static void main(String[] args) {
    LinkedList<Integer> integers = new LinkedList<Integer>();

    integers.addAtStart(5);
    integers.addAtStart(10);
    integers.addAtStart(12);
    integers.addAtStart(13);
    integers.addAtStart(22);
    integers.addAtStart(20);
    System.out.println("Before: " + integers);
//
//    System.out.println("Appending nodes: " + integers.appendNodes(integers, 3));
//    System.out.println("Reversing linked list: "+ integers.reverse(integers));
//    System.out.println("Find kth element: " + integers.findElement(integers, 3));
//    System.out.println("Delete duplicates " + integers.removeDuplicates(integers));
//    System.out.println("Deleting node " + integers.deleteNode(integers, integers.find(5)));
//    System.out.println("Cyclic: "+ integers.isCyclic(integers));

    System.out.println(integers.insertElement(integers, 3, 20));
  }

}
