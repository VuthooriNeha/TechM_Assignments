package Files;

import java.io.File;

public class task5 {
public static void main(String[] args) {
	String directoryPath="C:/ECLIPSE/techM/src/Exception_Handling"; 
	File directory = new File(directoryPath);
	if(directory.exists()) {
    if (directory.isDirectory()) {
        System.out.println("given path is a directory.");
        return;
    }
    else if(directory.isFile()) {
    	System.out.println("given path is a file.");
    }
    else {
        System.out.println(directory + " is neither a file nor a directory.");
	}
}
	 else {
         System.out.println("The specified pathname does not exist.");
     }
}
}