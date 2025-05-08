import java.io.*;
import java.util.*;

public class DinoDownloader {


    public  String[][] readCSV(String filePath) {
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
        System.out.println(result.length);
        System.out.println(result[0][10]);
        return result;
    }
}
