package techm_assignment;
import java.util.*;
public class Last_Character_in_Every_Word {
	public static void main(String[] args) {
		Scanner haha=new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String h=haha.nextLine();
		String res="";
		for(int i=0;i<h.length();i++) {
			if(h.charAt(i) == ' ' && Character.isAlphabetic(h.charAt(i-1))) {
				res+=h.charAt(i-1);
			}
		}
		res+=h.charAt(h.length()-1);
		System.out.println(res);
		haha.close();
	}
}
