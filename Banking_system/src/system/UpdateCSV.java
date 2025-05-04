package system;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.*;

public class UpdateCSV {

    UpdateCSV(String amount, int targetRow) {
        String filePath = "data.csv";
        List<String[]> allData = new ArrayList<>();
        System.out.println(targetRow);
        try {
            // Step 1: Read CSV
            CSVReader reader = new CSVReader(new FileReader(filePath));
            allData = reader.readAll();
            reader.close();

            // Step 2: Update cell at row 2 (index 2) and column 2 (index 2)
            int targetCol = 2;    // 0 = id, 1 = name, 2 = age

            if (targetRow < allData.size()) {
                String[] row = allData.get(targetRow);
                if (targetCol < row.length) {
                    row[targetCol] = amount;  // new value
                }
            }

            // Step 3: Write back to file
            CSVWriter writer = new CSVWriter(new FileWriter(filePath));
            writer.writeAll(allData);
            writer.close();

            System.out.println("Cell updated successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
