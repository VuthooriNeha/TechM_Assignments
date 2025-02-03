package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class task9 {
	public static void main(String[] args) {

        String filePath = "C:/ECLIPSE/techM/src/Files/file.txt"; 
        File file = new File(filePath);

     
        if (file.exists()) {
         
            try (FileInputStream fis = new FileInputStream(file)) {
         
                long fileSize = file.length();

                
                byte[] fileBytes = new byte[(int) fileSize];

                
                int bytesRead = fis.read(fileBytes);

                if (bytesRead != -1) {
                    System.out.println("File read successfully. File size: " + bytesRead + " bytes.");
                    } else {
                    System.out.println("Error reading the file.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file: " + e.getMessage());
            }
        } else {
            System.out.println("The specified file does not exist.");
        }
    }
}
