package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class task7 {
public static void main(String[] args) {
	File file=new File("C:/ECLIPSE/techM/src/Files/file.txt");
	FileOutputStream fos=null;
	try {
		fos=new FileOutputStream(file);
		
		Scanner haha=new Scanner(System.in);
		System.out.println("Enter the String:");
		String h=haha.nextLine();
		
		for(int i=0;i<h.length();i++) {
			fos.write(h.charAt(i));
		}
		fos.close();
		System.out.println("Data entered into file successfully");
		haha.close();
	}
	catch(IOException e) {
		System.out.println(e);
	}
}
}
