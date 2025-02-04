package Files;

import java.io.File;
import java.text.SimpleDateFormat;

public class task6 {
public static void main(String[] args) {
	String filename="C:/ECLIPSE/techM/src/Exception_Handling/file.txt";
	File file=new File(filename);
	if(file.exists()) {
		long date=file.lastModified();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String formatdate=sdf.format(date);
		System.out.println("Last formatted Date is: "+formatdate);
	}
	else {
		System.out.println("The specified file does not exist.");
	}
}
}
