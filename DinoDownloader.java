import java.io.*;
import java.util.*;

public class DinoDownloader {
    public static void main(String[] args) {
        String filePath = "/workspaces/Final-RPG/dinosaurs.csv"; // Change to your CSV file path
        String[][] data = readCSV(filePath);

        // Print the 2D array
        for (String[] row : data) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static String[][] readCSV(String filePath) {
        List<String[]> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                lines.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convert List<String[]> to String[][]
        String[][] result = new String[lines.size()][];
        for (int i = 0; i < lines.size(); i++) {
            result[i] = lines.get(i);
        }

        return result;
    }
}
