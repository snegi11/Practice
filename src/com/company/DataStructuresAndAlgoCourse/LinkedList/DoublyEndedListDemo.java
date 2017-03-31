package com.company.DataStructuresAndAlgoCourse.LinkedList;

/**
 * Created by srnegi on 3/18/2017.
 */
public class DoublyEndedListDemo {

  public static void main(String[] args) {
    DoublyEndedList dlist = new DoublyEndedList();

    dlist.insertAtTail(19);
    dlist.insertAtTail(18);
    dlist.insertAtTail(17);

    System.out.println(dlist);
  }
}
