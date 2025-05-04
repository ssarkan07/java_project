package system;
import java.io.*;
public class AccountInfo {
    // Private global variables
    private static String accountNumber = "1234";
    private static String password = "1234";

    // Getter for accountNumber
    public static void saveAmountToFile(int amount) {
        try (FileWriter fw = new FileWriter("amount.txt")) {
            fw.write(Integer.toString(amount));
        } catch (IOException e) {
            System.out.println("Error saving amount: " + e.getMessage());
        }
    }
    
    public static void loadAmountFromFile(int am ) {
        try (BufferedReader br = new BufferedReader(new FileReader("amount.txt"))) {
            String line = br.readLine();
            int amount = Integer.parseInt(line);
            amount -= am;
            saveAmountToFile(amount);
        } catch (IOException | NumberFormatException e) {
            System.out.println("No previous amount found. Starting with ₹0.");
           
        }
    }
    public static String getAccountNumber() {
        return accountNumber;
    }

    // Setter for accountNumber
    public static void setAccountNumber(String accNum) {
        accountNumber = accNum;
    }

    // Getter for password
    public static String getPassword() {
        return password;
    }

    // Setter for password
    public static void setPassword(String pass) {
        password = pass;
    }
//    public static int getAmount() {
////    	return amount;
//    }
    public static void setAmount(int am) {
    	loadAmountFromFile(am);
    	
   
    }
}
