package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task11 {
	public static void main(String[] args) {
        
        String filePath = "C:/ECLIPSE/techM/src/Files/file.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                System.out.println(line); 
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
