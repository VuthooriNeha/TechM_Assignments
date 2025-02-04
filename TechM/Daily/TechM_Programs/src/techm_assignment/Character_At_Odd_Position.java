package techm_assignment;
import java.util.*;

public class Character_At_Odd_Position {
	public static void main(String[] args) {
		Scanner haha=new Scanner(System.in);
		System.out.println("Enter the String:");
		String h=haha.nextLine();
		String res="";
		for(int i=0;i<h.length();i++) {
			if(i%2!=0) {
				res+=h.charAt(i);
			}
		}
		System.out.println(res);
		haha.close();
	}
}
