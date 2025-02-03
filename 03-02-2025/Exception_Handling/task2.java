package Exception_Handling;

public class task2 {
public void check(int num) throws OddException{
	if(num%2==0) {
		System.out.println("The number is Even"+num);
	
	}
	else
		throw(new OddException("Exception is UserDefined The num is Odd"));
}
public static void main(String[] args) {
	task2 t=new task2();
	try {
	t.check(5);
	}
	catch(OddException e) {
		System.out.println(e.getMessage());
	}
}
}
