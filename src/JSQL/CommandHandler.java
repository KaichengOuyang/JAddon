package JSQL;

public class CommandHandler {
    public static void help(){
        System.out.println("Commands:");
        System.out.println("help - displays this help menu");
        System.out.println("exit - exits the program");
        System.out.println("import - imports a csv file");
        System.out.println("search - searches the dataset");
        System.out.println("export - exports the dataset to a csv file");
        System.out.println("");
        System.out.println("Enter 'help' for a list of commands.");
        System.out.println("Enter 'exit' to quit.");
        Controller.commandListener();
    }
    public static void exit(){
        System.out.println("Exiting...");
        System.exit(0);
    }

    public static void importFromCSV(String filePath) {
        System.out.println("Enter the file path of the csv file to import:");
        Import.importFromCSV(filePath);
        System.out.println("Import successful.");
        System.out.println("");
        System.out.println("Enter 'help' for a list of commands.");
        System.out.println("Enter 'exit' to quit.");
        Controller.commandListener();
    }
    public static void exportToCSV(String filePath) {
        Export.exportToCSV(filePath);
        System.out.println("Export successful.");
        System.out.println("");
        System.out.println("Enter 'help' for a list of commands.");
        System.out.println("Enter 'exit' to quit.");
        Controller.commandListener();
    }
}
