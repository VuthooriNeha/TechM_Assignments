package techm_assignment;
import java.util.*;
public class Reverse_Number {
	public static void main(String[] args) {
		Scanner haha=new Scanner(System.in);
		System.out.println("Enter integer");
		int h=haha.nextInt();
		int r,rev=0;
		while(h>0) {
			r=h%10;
			h=h/10;
			rev=rev*10+r;
		}
		System.out.println(rev);
		haha.close();
	}
}
