package system;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class UpdateRecord {
	 UpdateRecord(String Account_num, String amount, String Categories) {
	        String filePath = "expenses.csv";

	        try {
	            // Create a new row
	            String[] newRow = { Account_num, amount, Categories };

	            // Append mode = true
	            CSVWriter writer = new CSVWriter(new FileWriter(filePath, true));
	            writer.writeNext(newRow);
	            writer.close();

	            System.out.println("Record added successfully.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}