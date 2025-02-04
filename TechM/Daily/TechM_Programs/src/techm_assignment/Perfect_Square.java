package techm_assignment;
import java.util.*;
public class Perfect_Square {
	public static void main(String[] args) {
		Scanner haha=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int h=haha.nextInt();
		double a=Math.sqrt(h);
		if(a*a==h) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		haha.close();
		
	}
}
