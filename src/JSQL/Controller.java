package JSQL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static JSQL.CommandHandler.exit;
import static JSQL.CommandHandler.help;

public class Controller {
    public static ArrayList<String[]> Dataset = new ArrayList<>();
    public static String Header = "";
    public static void Main(String filePath){
        Scanner sc = new Scanner(System.in);
        System.out.println("JADDON v0.1");
        System.out.printf("Copyright (C) 2019 by Peter.\n");
        System.out.printf("This program comes with ABSOLUTELY NO WARRANTY.\n");
        System.out.printf("This is free software, and you are welcome to redistribute it\n");
        System.out.printf("under certain conditions.\n");
        System.out.printf("\n");
        System.out.println("Enter 'help' for a list of commands.");
        System.out.println("Enter 'exit' to quit.");
        String command = "";
        command = sc.nextLine();
        if(command.equalsIgnoreCase("help")){
            help();
            command = sc.nextLine();
        } else if(command.equalsIgnoreCase("exit")){
            exit();
        } else if(command.equalsIgnoreCase("import")){

            command = sc.nextLine();
        } else if(command.equalsIgnoreCase("export")){
            System.out.println("Enter the file path of the csv file to export to:");
            command = sc.nextLine();
            Export.exportToCSV(command);
            System.out.println("Export successful.");
            System.out.println("");
            System.out.println("Enter 'help' for a list of commands.");
            System.out.println("Enter 'exit' to quit.");
            command = sc.nextLine();
        } else {
            System.out.println("Invalid command.");
            System.out.println("Enter 'help' for a list of commands.");
            System.out.println("Enter 'exit' to quit.");
            command = sc.nextLine();
        }
        sc.close();
    }
    public static void commandListener(){
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        if(command.equalsIgnoreCase("help")){
            System.out.println("Commands:");
            System.out.println("help - displays this help menu");
            System.out.println("exit - exits the program");
            System.out.println("import - imports a csv file");
            System.out.println("search - searches the dataset");
            System.out.println("export - exports the dataset to a csv file");
            System.out.println("");
            System.out.println("Enter 'help' for a list of commands.");
            System.out.println("Enter 'exit' to quit.");
            command = sc.nextLine();
        } else if(command.equalsIgnoreCase("exit")){
            System.out.println("Exiting...");
            System.exit(0);
        } else if(command.equalsIgnoreCase("import")){
            System.out.println("Enter the file path of the csv file to import:");
            String filePath = sc.nextLine();
            CommandHandler.importFromCSV(filePath);
        } else if(command.equalsIgnoreCase("export")){
            System.out.println("Enter the name you want to give the csv file:");
            command = sc.nextLine();
            CommandHandler.exportToCSV(command);
        } else {
            System.out.println("Invalid command.");
            System.out.println("Enter 'help' for a list of commands.");
            System.out.println("Enter 'exit' to quit.");
            command = sc.nextLine();
        }
        sc.close();
    }
}
