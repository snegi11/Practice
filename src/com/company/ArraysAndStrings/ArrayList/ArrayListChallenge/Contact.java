package com.company.ArraysAndStrings.ArrayList.ArrayListChallenge;

/**
 * Created by srnegi on 2/6/2017.
 */
// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contact (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contact
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.
//

  //use a public static method to create a new contact record
public class Contact {

  private String name;
  private String phoneNumber;

  //we dont need setters as ever time we want to set a contact we can use the constructor
  public Contact(String name, String phoneNumber) {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }
  public String getName() {
    return name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  //a public static method to create contact
  //static is important as we will not need to create an object of the class
  public static Contact createContact(String name, String phoneNumber){
    return new Contact(name,phoneNumber);
  }

}
