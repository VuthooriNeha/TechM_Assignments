package techm_assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Smallest_Vowel_in_a_String {
	public static void main(String[] args) {
		Scanner haha=new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String h=haha.next();
		h=h.replaceAll("[bcdfghjklmnopqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "");
		char[] c=h.toCharArray();
		Arrays.sort(c);
		System.out.println(c[0]);
		haha.close();
	}
}