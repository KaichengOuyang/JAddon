package JSQL;

public class Export {
    public static void exportToCSV(String filePath) {
        try {
            java.io.FileWriter fw = new java.io.FileWriter(filePath);
            java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
            bw.write(Controller.Header);
            bw.newLine();
            for (int i = 0; i < Controller.Dataset.size(); i++) {
                String[] data = Controller.Dataset.get(i);
                for (int j = 0; j < data.length; j++) {
                    bw.write(data[j]);
                    if (j < data.length - 1) {
                        bw.write(",");
                    }
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
