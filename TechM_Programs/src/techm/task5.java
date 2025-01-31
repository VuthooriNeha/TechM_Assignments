package techm;
import java.util.Scanner;

public class task5 {
	public static void main(String[] args) {
		Scanner haha=new Scanner(System.in);
		System.out.println("Enter the name:");
		String h=haha.next();
		String n="";
		for(int i=0;i<h.length();i++) {
			if(i%2==0)
			n+=Character.toUpperCase(h.charAt(i));
			else
				n+=h.charAt(i);
		}
		System.out.print(n);
		haha.close();
		
	}
}
