package jvbm.com;

import java.util.Scanner;

public class Menu {

    static boolean repeat = true;
    static Scanner scan = new Scanner(System.in);

    public static void options(){

        String decision;

        boolean exit = false;

        while (!exit){

            decision = scan.nextLine();

            if(decision.equalsIgnoreCase("no")){
                exit = true;
                menu();
            }

            else if (decision.equalsIgnoreCase("yes")){
                exit = true;
            }
        }
    }

    public static void menu(){

        System.out.println("\nMake your choice");
        int choice = scan.nextInt();
        scan.nextLine();

        switch (choice){
            case 0:
                System.out.println("Exit? (yes/no)");
                options();
                System.out.println("Shutting down now!");
                repeat = false;
                break;

            default:
                System.out.println("Invalid command! Please try again!");
        }
    }

    public static void main(String[] args) {
        while (repeat){
            menu();
        }
    }
}
