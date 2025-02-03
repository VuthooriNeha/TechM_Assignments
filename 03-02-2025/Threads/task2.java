package Threads;

import java.util.Scanner;

public class task2{


		public static void main(String[] arg) {
			Scanner sc=new Scanner(System.in);
			int number=sc.nextInt();
			EvenThread et=new EvenThread(number);
			OddThread ot=new OddThread(number);
			et.start();
			ot.start();
			sc.close();
		}
}
