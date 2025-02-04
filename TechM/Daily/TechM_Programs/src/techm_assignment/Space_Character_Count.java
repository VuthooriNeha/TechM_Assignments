package techm_assignment;
import java.util.*;

public class Space_Character_Count {
	public static void main(String[] args) {
		Scanner haha=new Scanner(System.in);
		System.out.println("Enter The String");
		String h=haha.nextLine();
		int n=h.length();
		int space=0,ch=0;
		/*for(int i=0;i<h.length();i++) {
			if(h.charAt(i)==' ')
				space+=1;
			else if(Character.isAlphabetic(h.charAt(i)))
				ch+=1;
		}*/
		h=h.replaceAll("\\s+","");
		space=n-(h.length());
		h=h.replaceAll("[0-9]","");
		ch=h.length();
		System.out.println("No of spaces : "+ space+" and characters : "+ch);
		haha.close();
	}
}
