package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task10 {
public static void main(String[] args) {
	 String filePath = "C:/ECLIPSE/techM/src/Files/file.txt"; 
     File file = new File(filePath);

  
     if (file.exists()) {
    	 Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}

         while (sc.hasNextLine()) {
             System.out.println(sc.nextLine());
         }
         sc.close();
     }

}
}
