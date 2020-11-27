package com.jvbm;

import java.util.List;
import java.util.Scanner;

public class Menu {

    static boolean repeat = true;
    static Scanner scan = new Scanner(System.in);
    private Contact contact;

    public static void options(){

        String decision;

        boolean exit = false;

        while (!exit){

            decision = scan.nextLine();

            if(decision.equalsIgnoreCase("N")){
                exit = true;
                mainMenu();
            }

            else if (decision.equalsIgnoreCase("Y")){
                exit = true;
            }
        }
    }

    public static void mainMenu(){
        System.out.println("======================");
        System.out.println("      Main Menu       ");
        System.out.println("======================");
        System.out.println("0. Exit");
        System.out.println("1. Add Contact");
        System.out.println("2. Contact List");
        System.out.println("3. Search Contact");
        System.out.println("4. Delete Contact");
        System.out.println("\nMake your choice");
        int choice = scan.nextInt();
        scan.nextLine();

        switch (choice){
            case 0:
                System.out.println("Exit? (Y/N)");
                options();
                System.out.println("Shutting down now!");
                repeat = false;
                break;
            case 1:
               // Context.addContact();
                break;
            case 2:
               // Context.viewContact();
                break;
            case 3:
               // Context.searchContact();
                break;
            case 4:
               // Context.deleteContact();
                break;
            default:
                System.out.println("Invalid command! Please try again!");
        }
    }

    private static Context context = new Context();
    private static int printCount = 0;

    public static void main(String[] args) {

        Print();
        context.AddContact("Bewar","bewar@maronsi.com");
        Print();
        context.RemoveContact("Bewar");
        Print();
        context.Search("Philip");
    }

    private static void Print()
    {
        printCount++;
        List<Contact> list = context.getList();
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒ Print " + printCount + " ▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("Name" + "\t\t" + "Email");
        System.out.println("-----------------------");
        for (int i = 0; i < list.size(); i++)
        {
            Contact cc = list.get(i);

            System.out.println(cc.name + "\t\t" + cc.email);
        }

        System.out.println("-----------------------");

    }
}
