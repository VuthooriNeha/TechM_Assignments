package techm;
import java.util.*;
public class task2 {
	public static void main(String[] args) {
		
		Scanner haha=new Scanner(System.in);
		System.out.println("Enter no of students");
		int s=haha.nextInt();
		int arr[][]=new int[s][3];
		int arr1[]=new int[s];
		for(int i=0;i<s;i++) {
			System.out.println("Enter "+i +" students marks");
			for(int j=0;j<3;j++) {
				arr[i][j]=haha.nextInt();
			}
		}
		
		for(int i=0;i<s;i++) {
			for(int j=0;j<3;j++) {
				arr1[i]+=arr[i][j];
			}
			arr1[i]/=3;
		}
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		Arrays.sort(arr1);
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		haha.close();
		
	}
}
