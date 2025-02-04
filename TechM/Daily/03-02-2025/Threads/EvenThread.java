package Threads;

public class EvenThread extends Thread{
	private int number;
	 public EvenThread(int number) {
		 this.number=number;
	 }
	public void run() {
		for(int i=1;i<=number;i++) {
			if(i%2==0) {
				System.out.println("Even: "+i);
			}
		}
		
	}
}
