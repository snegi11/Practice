package com.company.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by srnegi on 2/13/2017.
 */
public class Demo {
  public static void main(String[] args) {
    LinkedList<String> placesToVisit = new LinkedList<String>();
    addInOrder(placesToVisit,"Delhi");
    addInOrder(placesToVisit,"Mumbai");
    addInOrder(placesToVisit,"Banglore");
    addInOrder(placesToVisit,"Pune");
    addInOrder(placesToVisit,"Chandigarh");
    addInOrder(placesToVisit,"Chennai");
    addInOrder(placesToVisit,"Goa");
    printList(placesToVisit);

    placesToVisit.add("Delhi");
    placesToVisit.add("Mumbai");
    placesToVisit.add("Banglore");
    placesToVisit.add("Pune");
    placesToVisit.add("Chandigarh");
    placesToVisit.add("Chennai");
    placesToVisit.add("Goa");

    printList(placesToVisit);

    placesToVisit.add(1,"Surat");
    printList(placesToVisit);

    placesToVisit.remove("Pune");
    printList(placesToVisit);
  }
  private static void printList(LinkedList<String> linkedList){
    Iterator<String> i = linkedList.iterator();
    while(i.hasNext()){
      System.out.println("Now visiting "+ i.next());
    }
    System.out.print("---------------------------"+"\n");
  }

  private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
    ListIterator<String> stringListIterator = linkedList.listIterator();
    while(stringListIterator.hasNext()){
      //stringListIterator.next() takes you to the first entry
      int comparison = stringListIterator.next().compareTo(newCity);
      if(comparison==0){//equal, do not add
        System.out.println(newCity + " is already included ");
        return false;
      }
      else if(comparison>0){
        //new city should appear before this one!
        stringListIterator.previous();
        stringListIterator.add(newCity);
      }
    }
    stringListIterator.add(newCity);
    return true;
  }


}
