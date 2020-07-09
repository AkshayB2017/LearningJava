import java.io.*;
import java.util.Scanner;
public class output {

	public static void main(String[] args) {
		int n,i=1;
		Scanner s=new Scanner(System.in);
		n=Integer.parseInt(s.nextLine());
		for(int j=0;j<n;j++) {
			System.out.println(i+" "+i+" "+i+" "+i+" "+i+" ");
			i+=1;
		}
		for(int j=0;j<n;j++) {
			System.out.println("*****");
			
		}
		for(int j=0;j<n;j++) {
			System.out.println("12345");
			
		}
		i=1;
		for(int j=0;j<n;j++) {
			for(int k=0;k<i;k++)
			{
				System.out.print("*");	
			}
			System.out.print("\n");
			i+=1;
		}
	
	}
}
