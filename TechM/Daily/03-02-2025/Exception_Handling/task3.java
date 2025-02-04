package Exception_Handling;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;
import java.net.URI;
import java.util.*;
public class task3 {
	public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
public static void main(String[] args) {
	try {
        readFile("C:/ECLIPSE/techM/src/Exception_Handling/file1.txt");
    } catch (FileNotFoundException e) {
        System.out.println("Error:File not found  " + e.getMessage());
    }
}
}
