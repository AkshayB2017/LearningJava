import java.io.*;
import java.util.Scanner;
public class series1 {

	public static void main(String[] args) {
	    int n;
		Scanner s= new Scanner(System.in);
		n= Integer.parseInt(s.nextLine());
		int num1=2, num2=1, num3=1;
		int i=0;
		while(i<n) {
			System.out.println(num1*num1);
			num1+=2;
			i+=1;
		}
		i=0;
		while(i<n) {
			System.out.println(num2);
			num2+=1;
			i+=1;
		}
		i=0;
		while(i<n) {
			System.out.println(num3*num3*num3);
			num3+=1;
			i+=1;
		}
		
	}
}
