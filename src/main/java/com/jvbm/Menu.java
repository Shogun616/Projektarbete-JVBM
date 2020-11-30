package com.jvbm;

import java.util.List;
import java.util.Scanner;

public class Menu {

    private static final Context context = new Context();
    private static int printCount = 0;
    static boolean repeat = true;
    static Scanner scan = new Scanner(System.in);

    private static void Print() {
        printCount++;
        List<Contact> list = Context.getList();
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒ Contact list " + printCount + " ▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("Name" + "\t\t" + "Email");
        System.out.println("-----------------------");
        for (Contact cc : list) {
            System.out.println(cc.name + "\t\t" + cc.email);
        }

        System.out.println("-----------------------");
    }

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
                context.AddContact();
                break;
            case 2:
                Print();
                break;
            case 3:
               context.ConsoleSearch();
                break;
            case 4:
               context.RemoveContact();
                break;
            default:
                System.out.println("Invalid command! Please try again!");
        }
    }

    public static void main(String[] args) {
        while (repeat){
            mainMenu();
        }
    }
}