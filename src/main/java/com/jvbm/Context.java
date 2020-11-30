package com.jvbm;

import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Context {

    static Scanner scan = new Scanner(System.in);
    private static final List<Contact> contacts = new ArrayList<>();

    public Context() {
        contacts.add(new Contact(java.util.UUID.randomUUID().toString(), "Philip", "philip@mail.com"));
        contacts.add(new Contact(java.util.UUID.randomUUID().toString(), "Samir", "samir@mail.com"));
        contacts.add(new Contact(java.util.UUID.randomUUID().toString(), "Adam", "adam@mail.com"));
        contacts.add(new Contact(java.util.UUID.randomUUID().toString(), "Sara", "sara@mail.com"));
        contacts.add(new Contact(java.util.UUID.randomUUID().toString(), "Jessica", "jessica@mail.com"));
    }

    public static List<Contact> getList(){
        return contacts;
    }

    public void AddContact(){
        System.out.println("Please add the new contact");
        System.out.println();
        System.out.print("Name: ");
        String name = scan.nextLine();

        System.out.print("Email: ");
        String email = scan.nextLine();

        contacts.add(new Contact(java.util.UUID.randomUUID().toString(), name, email));
        System.out.println("Added new contact");
    }

    public void RemoveContact(String name){

        Contact contactToDelete = null;

        String decision;

        for (Contact contact : contacts) {
            if (contact.name.equals(name)) {
                contactToDelete = contact;
            }
        }

        if(contactToDelete != null)
        {
            System.out.println("Contact " + contactToDelete.name + " found, would you like to delete? (Y/N)");
            decision = scan.nextLine();
            if(decision.equalsIgnoreCase("N")){
                System.out.println("Action Canceled");
            }
            else if(decision.equalsIgnoreCase("Y")){
                contacts.remove(contactToDelete);
                System.out.println("Contact Deleted");
            }

        }
        else
        {
            System.out.println("No Contact Found");
        }
    }

    public final void ConsoleSearch() {

        System.out.println(" ");

        System.out.println("You have opened the console search method");

        System.out.println(" ");

        System.out.print("Enter your search String: ");
        String value = new Scanner(System.in).nextLine();

        ArrayList<Contact> result = (ArrayList<Contact>) contacts.stream().filter(x -> x.name.contains(value) || x.email.contains(value)).collect(Collectors.toList());

        if (!result.isEmpty()) {
            System.out.printf("Found %1$s results!%n", result.size());

            for (Contact contact : result) {
                System.out.printf("ID: %1$s, Name: %2$s, Email: %3$s%n", contact.id, contact.name, contact.email);
            }
        } else {
            System.out.printf("No contacts found with '%1$s'%n", value);
        }
        System.out.println(" ");
    }
}
