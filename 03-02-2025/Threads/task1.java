package Threads;

public class task1 extends Thread{
public void create() {
	Thread t=new Thread(this);
	t.start();
}
public void run() {
	System.out.println("Hello Java");
}
public static void main(String[] args) {
	task1 t1=new task1();
	t1.create();
	System.out.println("Main Thread will be executed");
}
}
