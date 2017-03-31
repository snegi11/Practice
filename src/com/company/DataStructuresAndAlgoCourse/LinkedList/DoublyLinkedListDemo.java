package com.company.DataStructuresAndAlgoCourse.LinkedList;

/**
 * Created by srnegi on 3/19/2017.
 */
public class DoublyLinkedListDemo {
  public static void main(String[] args) {
    DoublyLinkedList integers = new DoublyLinkedList();
    integers.insertAtHead(5);
    integers.insertAtHead(15);
    integers.insertAtHead(25);
    integers.insertAtHead(35);
    integers.insertAtHead(45);
    integers.insertAtHead(55);
    integers.insertAtHead(65);

    System.out.println(integers);
  }

}
