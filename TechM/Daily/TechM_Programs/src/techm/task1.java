package techm;
public class task1 {
	//system.arraycopy and Array.copyOfRange
	public static void main(String [] args) {
		int a[]= {10,20,30,40,50,60,70};
		int b[]= {100,200,300,400,500,600,700};
		
		/*for(int i=0;i<a.length-1;i=i+2) {
			System.arraycopy(a, i, b, i+1, 1);
		}
		Output:-100 10 300 30 500 50 700 
		*/
		
		
		int j=0;
		for(int i=0;i<a.length;i=i+2) {
			System.arraycopy(a, i, b, j, 1);
			j++;
		}
		//Output:- 10 30 50 70 500 600 700 
		
		for(int jj:b) {
			System.out.print(jj+" ");
		}
	}
	
}
