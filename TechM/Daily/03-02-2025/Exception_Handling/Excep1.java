package Exception_Handling;

public class Excep1 {
public static void main(String[] args) {
	int num1,num2,res;
	num1=Integer.parseInt(args[0]);
	num2=Integer.parseInt(args[1]);
	try {
		res=num1/num2;
	}
	catch(ArithmeticException e) {
		//System.err.println("Cannot be divisible by zero");
		e.printStackTrace();
	}
	finally {
		num2++;
		res=num1/num2;
		System.out.println("Ans is: "+res);
	}
	
}
}
