package techm;
import static java.lang.Integer.*;
public class test1 {
	public static void main(String[] args)
	{
		//type convertions-converting string to its own datatype
		int num1=parseInt(args[0]);
		int num2=parseInt(args[1]);
		int res= num1+num2;
		System.out.println(res);
	}
}