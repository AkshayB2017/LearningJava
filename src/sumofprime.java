import java.io.*;
import java.util.Scanner;
public class sumofprime {

	public static void main(String[] args) {
		int n,m,prime=0,i,j;
		Scanner s= new Scanner(System.in);
		n= Integer.parseInt(s.nextLine());
		m= Integer.parseInt(s.nextLine());
		for(i=n;i<m;i++) {
			boolean flag=false;

			for(j = 2; j <= i/2; ++j)
	        {
	            // condition for nonprime number num%i
	            if(i % j == 0)
	            {
	                flag = true;
	                break;
	            }
	        }
			if (!flag) {
	            System.out.println(i + " is a prime number.");
	               prime+=i;
		}
		}
		System.out.println(prime);
	}
}
