package Files;

import java.io.File;

public class task4 {
	public static void main(String[] args) {
        // Specify the file or directory path
        String filePath = "C:/ECLIPSE/techM/src/Exception_Handling"; 
        File file = new File(filePath);

       
        if (file.exists()) {
           
            boolean canRead = file.canRead();
            boolean canWrite = file.canWrite();

       
            System.out.println("File/Directory: " + filePath);
            System.out.println("Can read: " + (canRead ? "Yes" : "No"));
            System.out.println("Can write: " + (canWrite ? "Yes" : "No"));
        } else {
            System.out.println("The specified file or directory does not exist.");
        }
    }
}
