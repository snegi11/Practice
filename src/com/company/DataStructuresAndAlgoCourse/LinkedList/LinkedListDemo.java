package com.company.DataStructuresAndAlgoCourse.LinkedList;

/**
 * Created by srnegi on 3/18/2017.
 */
public class LinkedListDemo {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.insertAtHead(5);
    list.insertAtHead(10);
    list.insertAtHead(15);
    list.insertAtHead(12);
    list.insertAtHead(9);
    list.insertAtHead(20);
    list.insertAtHead(2);

    list.deleteFromHead();
    System.out.println("Found: "+list.find(8));
    System.out.println(list);
    System.out.println("Length: " + list.length() );
  }
}
