package techm_assignment;
import java.util.*;

public class Vowels_Consonants_Count {
	public static void main(String[] args) {
		Scanner haha=new Scanner(System.in);
		System.out.println("Enter the String:");
		String h=haha.nextLine();
		int vowel=0,consonant=0;
		for(int i=0;i<h.length();i++) {
			if(Character.isAlphabetic(h.charAt(i))) {
				if(h.charAt(i)=='A' || h.charAt(i)=='E' || h.charAt(i)=='I' ||h.charAt(i)=='O' 
						||h.charAt(i)=='U' ||h.charAt(i)=='a' ||h.charAt(i)=='e' ||h.charAt(i)=='i' 
						||h.charAt(i)=='o'||h.charAt(i)=='u' ) {
					vowel+=1;
				}
				else {
					consonant+=1;
				}
			}
		}
		System.out.println("Vowels count - "+ vowel);
		System.out.println("Consonants count - "+consonant);
		haha.close();
		
	}
}
