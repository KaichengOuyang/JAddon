package JSQL;

public class Import {
    public static void importFromCSV(String fileName){
        try {
            java.io.FileReader fr = new java.io.FileReader(fileName);
            java.io.BufferedReader br = new java.io.BufferedReader(fr);
            String line = br.readLine();
            Controller.Header = br.readLine();
            while (line != null) {
                String[] data = line.split(",");
                Controller.Dataset.add(data);
                line = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
