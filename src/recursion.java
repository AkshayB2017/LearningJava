import java.io.*;
import java.util.Scanner;
public class recursion {

	public static void main(String args[]) {
		int factor,n;
		Scanner s=new Scanner(System.in);
		n= Integer.parseInt(s.nextLine());
		factor= factorial(n);
		System.out.println(factor);
	}
	static int factorial(int number) {
	    if(number==1) {
	    	return 1;
	    }
	    else {
	    	return number*factorial(number-1);
	    }
}
}