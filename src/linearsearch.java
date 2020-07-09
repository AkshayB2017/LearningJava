import java.io.*;
import java.util.Scanner;
public class linearsearch {

	public static void main(String[] args) {
		long a,b,c;
		int[] arr= new int[100];
		Scanner s=new Scanner(System.in);
		a=Long.parseLong(s.nextLine());
		b=Long.parseLong(s.nextLine());
		c=a+b;
		System.out.println(c);
		System.out.println("Enter number of elements of array");
		int n=Integer.parseInt(s.nextLine());
		for(int i=0;i<n;i++) {
			System.out.println("Enter number: ");
			arr[i]=Integer.parseInt(s.nextLine());
			
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter number to search");
		int number=Integer.parseInt(s.nextLine());
		int flag=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==number)
			{
			System.out.println("Number found");
			flag=1;
			}
			

			}if(flag==0) {
				System.out.println("Number not found");
		}
	}
}
