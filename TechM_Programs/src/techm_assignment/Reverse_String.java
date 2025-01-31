package techm_assignment;
import java.util.*;
public class Reverse_String {
	public static void main(String[] args) {
		Scanner haha=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String h=haha.next();
		String res="";
		for(int i=h.length()-1;i>=0;i--) {
			res+=h.charAt(i);
		}
		System.out.println(res.toLowerCase());
		haha.close();
	}
}
