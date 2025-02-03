package Threads;

public class OddThread extends Thread {
	 private int number;
	 public OddThread(int number) {
		 this.number=number;
	 }
	public void run() {
		for(int i=1;i<=number;i++) {
			if(i%2!=0) {
				System.out.println("Odd: "+i);
			}
		}
		
	}
}
