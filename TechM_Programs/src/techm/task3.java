package techm;
import java.util.Arrays;
public class task3 {
public static void main(String[] args) {
	int a[]= {1,2,3};
	int b[]= {1,2,3};
	
	int h[][]={{1,2,3},{4,5,6}};
	int hh[][]= {{1,2,3},{4,5,6}};
	
	String n="neha";
	String nn="neha";
	
	System.out.println(Arrays.equals(a, b));//checks elements only in 1D
	System.out.println(a.equals(b));//checks elements but not array elements
	System.out.println(n==nn);//checks the address (true because of stringpool)
	System.out.println(Arrays.deepEquals(h,hh));//checks the elements even in nested arrays
}
}
