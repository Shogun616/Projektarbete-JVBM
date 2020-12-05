package ui;

import domain.Contact;
import domain.ContactBook;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {

    static boolean repeat = true;
    static Scanner scan = new Scanner(System.in);
    private Contact contact;
    private static ContactBook contactBook = new ContactBook();
    private static int printCount = 0;


    public static void options() {
        System.out.println("Exit? (Y/N)");
        String decision;

        boolean exit = false;

        while (!exit) {

            decision = scan.nextLine();

            if (decision.equalsIgnoreCase("N")) {
                exit = true;
                mainMenu();
            } else if (decision.equalsIgnoreCase("Y")) {
                System.out.println("Shutting down now!");
                repeat = false;
                exit = true;
            } else {
                System.out.println("Wrong input! Enter Y/N ");
            }
        }
    }


    public static void mainMenu() {
        while (repeat) {
            System.out.println("======================");
            System.out.println("      Main Menu       ");
            System.out.println("======================");
            System.out.println("0. Exit");
            System.out.println("1. Add Contact");
            System.out.println("2. Contact List");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");


            int choice = readInteger();

            switch (choice) {
                case 0:
                    options();
                    break;
                case 1:
                    add();
                    break;
                case 2:
                    Print();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                default:
                    System.out.println("Wrong input! Please choose a number between 1 and four.");
            }
        }
    }


//    public static void main(String[] args) {
//        mainMenu();
//        Print();
//        context.AddContact("Bewar","bewar@maronsi.com");
//        Print();
//        context.RemoveContact("Bewar");
//        Print();
//        context.Search("Philip");
//        context.ConsoleSearch();
// }

    private static void add() {
        System.out.println("Please enter name and email of the new user");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("email:");
        String email = scan.nextLine();
        contactBook.AddContact(name, email);
        System.out.println("New contact added successfully!");
        Print();
    }

    public static void deleteContact() {
        System.out.println("Enter name of contact to you want to delete:");
        System.out.println("Name:");
        String name = scan.nextLine();
        contactBook.removeContact(name);
    }

    private static void searchContact() {
        System.out.println("Enter a string to match a contact against: ");
        String matchContact = scan.nextLine();
        contactBook.Search(matchContact);

    }

    private static void Print() {

        printCount++;
        List<Contact> list = contactBook.getList();
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒ Print " + printCount + " ▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("Name" + "\t\t\t\t" + "Email");
        System.out.println("-----------------------------------");
        for (int i = 0; i < list.size(); i++) {
            Contact cc = list.get(i);

            System.out.println(cc.name + "\t\t\t\t" + cc.email);

        }

        System.out.println("-----------------------------------");

    }

    public static int readInteger() {

        Boolean loop = true;
        int tal = 0;


        while (loop) {

            try {
                System.out.println("\nChoose from menu:");
                tal = scan.nextInt();
                loop = false;

            } catch (InputMismatchException e) {

                System.out.println("Wrong input!Please choose a number between 1 and four.");
                //throw new InputMismatchException("Wrong input!Please choose a number between 1 and four.");
            }
            scan.nextLine();
        }
        return tal;
    }
}

