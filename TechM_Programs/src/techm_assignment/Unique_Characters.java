package techm_assignment;
import java.util.*;
public class Unique_Characters {
	public static void main(String[] args) {
		Scanner haha=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String h=haha.next();
		String res="";
		for(int i=0;i<h.length();i++) {
			if(res.indexOf(h.charAt(i))<0) {
				res+=h.charAt(i);
			}
		}
		System.out.println(res);
		haha.close();
	}
}
