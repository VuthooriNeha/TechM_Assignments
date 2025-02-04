package techm;

import java.util.Arrays;

public class task4 {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int b[]= Arrays.copyOfRange(a, 1, 3);
		for(int j:b) {
			System.out.println(j);
		}
		
	}
}
