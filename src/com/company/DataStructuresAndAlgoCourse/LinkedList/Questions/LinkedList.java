package com.company.DataStructuresAndAlgoCourse.LinkedList.Questions;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by srnegi on 3/19/2017.
 */
public class LinkedList<T> {

  private Node<T> head;
    public Node<T> getHead() {
    return this.head;
  }

  public void setHead(Node<T> head) {
    this.head = head;
  }

// 1. Append the last n nodes of a linked list to the beginning of the list.
// Will keeping the length as a member variable inside the LinkedList class, help?

  public LinkedList<Integer> appendNodes(LinkedList<Integer> ll , int n){

    Node<Integer> ref1 = ll.getHead();
    Node<Integer> ref2 = ll.getHead();

    // move ref1 by n
    for(int i=0;i<n;i++){
      ref1 = ref1.getNextNode();
    }

    while(ref1.getNextNode()!=null){
      ref1 = ref1.getNextNode();
      ref2 = ref2.getNextNode();
    } // now ref1 should be pointing to the last node


    ref1.setNextNode(ll.getHead());
    // last node now connects with the head
    // we need to make the next node of ref2 as the head of the list
    ll.setHead(ref2.getNextNode());
    ref2.setNextNode(null);
    return ll;
  }

 // 2. Write a 'reverse' method in the LinkedList class, which reverses the order of the elements of the list.

  public LinkedList<Integer> reverse(LinkedList<Integer> ll){
    Node prev = null;
    Node next;
    Node current = ll.getHead();

    while(current!=null){
      next = current.getNextNode();
      current.setNextNode(prev);
      prev = current;
      current =next;
    }
    ll.setHead(prev);

    return ll;
  };

// 3. Write a method to find kth element from a singly linked List from the end(not from the head) in one pass.

  public Node<Integer> findElement(LinkedList<Integer> ll, int k){

//    Node<Integer> current = ll.getHead();
//
//    for(int i=0;i<k-1;i++){
//      current = current.getNextNode();
//    }
//
//    return current;

    Node<Integer> ref1 = ll.getHead();
    Node<Integer> ref2 = ll.getHead();

    for(int i=0;i<k;i++){
      ref1 = ref1.getNextNode();
    }
    while(ref1.getNextNode()!=null){
      ref1=ref1.getNextNode();
      ref2=ref2.getNextNode();
    }
    return ref2;
  }

// 4.Write an algorithm to remove duplicates from an unsorted linked list. What is the time complexity?
// (You can use the Set provided in the JDK). How will you solve it if additional memory is not allowed?

public LinkedList<Integer> removeDuplicates(LinkedList<Integer> ll){
  Set<Integer> LinkedListSet = new HashSet<>();
  Node<Integer> current = ll.getHead();
  Node prev =null;
  while(current!=null){
    if(LinkedListSet.contains(current.getData())){
      prev.setNextNode(current.getNextNode());
    }
    else {
      LinkedListSet.add(current.getData());
      prev = current;
    }
    current=current.getNextNode();
  }
return ll;
}

// 5. Implement an algorithm to delete a node from somewhere in the middle of a SINGLY linked list,
// given that you have access only to this node (and of course the subsequent nodes).
//  E.g.
//    INPUT: The node 'v' from the linked list u->v->w->x->y->z
//  RESULT: The new list should look like this u->w->x->y->z

  public LinkedList<Integer> deleteNode(LinkedList<Integer> ll, Node<Integer> node){

    while(node.getNextNode()!=null && node!=null){
      node.setData(node.getNextNode().getData());
      node.setNextNode(node.getNextNode().getNextNode());
    }
    return ll;
  }


// 6.How can you identify if a Linked List is circular? (Think about using two pointers/references)

  public boolean isCyclic(LinkedList<Integer> linkedList){
    Node<Integer> slow = linkedList.getHead();
    Node<Integer> fast = linkedList.getHead().getNextNode();

    while(fast!=null && fast.getNextNode()!=null){
      fast = fast.getNextNode().getNextNode();
      slow = slow.getNextNode();
      if(fast==slow){
        return true;
      }
    }
   return false;
  }

  //7. Insert at nth position.

  public LinkedList<Integer> insertElement(LinkedList<Integer> ll, int k, int data
  ){

//    Node<Integer> current = ll.getHead();
//
//    for(int i=0;i<k-1;i++){
//      current = current.getNextNode();
//    }
//
//    return current;

    Node<Integer> ref1 = ll.getHead();
    Node<Integer> ref2 = ll.getHead();

    for(int i=0;i<k+1;i++){
      ref1 = ref1.getNextNode();
    }
    while(ref1.getNextNode()!=null){
      ref1=ref1.getNextNode();
      ref2=ref2.getNextNode();
    }

    Node<Integer> newNode = new Node<>(data);

    newNode.setNextNode(ref2.getNextNode());
    ref2.setNextNode(newNode);
    newNode.setData(data);

    return ll;



  }

  public void addAtStart(T data) {
    Node<T> newNode = new Node<T>(data);
    newNode.setNextNode(this.head);
    this.head = newNode;
  }

  public Node<T> deleteAtStart() {
    Node<T> toDel = this.head;
    this.head = this.head.getNextNode();
    return toDel;
  }

  public Node<T> find(T data) {
    Node<T> curr = this.head;
    while (curr != null) {
      if (curr.getClass().equals(data)) {
        return curr;
      }
      curr = curr.getNextNode();
    }
    return null;
  }

  public int length() {
    if (head == null)
      return 0;
    int length = 0;
    Node<T> curr = this.head;
    while (curr != null) {
      length += 1;
      curr = curr.getNextNode();
    }
    return length;
  }

  public boolean isEmpty() {
    return this.head == null;
  }
  @Override
  public String toString(){
    String result = "{";
    Node<T> current = this.head;

    while(current!=null){
      result += current.toString()+ ",";
      current = current.getNextNode();
    }
    result += "}";
    return result;
  }
}
