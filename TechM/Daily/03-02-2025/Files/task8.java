package Files;

import java.io.File;

public class task8 {
public static void main(String[] args) {
	String filename="C:/ECLIPSE/techM/src/Files/file.txt";
	File file=new File(filename);
	if(file.exists()) {
		long s=file.length();
		double h=s/1024.0;
		double hh=h/1024.0;
		System.out.println("File size in bytes: " + s);
        System.out.println("File size in KB: " + h);
        System.out.println("File size in MB: " +hh);
	}
	else {
		System.out.println("File doesnt exists");
	}
}
}
