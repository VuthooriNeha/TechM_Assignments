package techm;

public class test3 {
	public static void main(String[] args) {
		int num=2;
		String res = switch(num) {
		case 1,2->
		{
			yield "Hii";
		}
		case 3,4->
		{
			yield "Neha";
		}
		default->
		{
			yield "error";
		}
		};
        System.out.println(res);
        String res1 = switch(num) {
		case 1,2:
			yield "Hii";
		case 3,4:
			yield "Neha";
		default:
			yield "error";
		};
        System.out.println(res1);
	}
}
