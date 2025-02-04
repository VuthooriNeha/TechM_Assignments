package techm;

public class test2 {
	public static void main(String[] args) {
		double num1=20.06;
		float num2;
		
		//explicit type casting
		num2=(float)num1;
		System.out.println(num2);
		
		//implicit type casting
		float num3=30.6F;
		double num4;
		num4=num3;
		System.out.println(num4);
		
	}
}
