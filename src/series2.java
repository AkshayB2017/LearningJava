import java.io.*;
import java.util.Scanner;
import java.lang.Math; 

public class series2 {
	public static void main(String[] args) {
		int n;
		Scanner s= new Scanner(System.in);
		n= Integer.parseInt(s.nextLine());
		int num1=1, num2=1, num3=1;
		int i=0;
		int u1=1,u2=4,u3=7;
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		while(i<n-3) {
			u3=u3+u2+u1;
			u1=u2;
			u2=u3;
			System.out.println(u3);
			i+=1;
		}
		i=0;
		while(i<n) {
			System.out.println(num2*num2);
			num2+=1;
			i+=1;
		}
		i=0;
		while(i<n) {
			System.out.println(((3*(n-1)*(n-1))+(3+Math.pow(-1,n)))/2);
			i+=1;
			n+=1;
		}
		//3(n - 1)² + (3 + (-1)^n)/2.

	}
}
