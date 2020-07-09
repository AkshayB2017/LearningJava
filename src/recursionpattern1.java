import java.io.*;
import java.util.Scanner;
public class recursionpattern1 {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n= Integer.parseInt(s.nextLine());
		pattern1(n);
		System.out.print("\n");
		pattern2(n);
		System.out.print("\n");
		pattern3(n);
		System.out.print("\n");
		pattern4(n);
	}
	
	static void pattern1(int n) {
		int i=1,j=1;
		System.out.print(i);
		while(j<n) {
			System.out.print(" "+(i+j*j));
			i=(i+(j*j));
			j+=1;
		}
	}
	static void pattern2(int n) {
		int i=1,j=1;
		System.out.print(i);
		System.out.print("  ");
		System.out.print(j);
		while(j<n) {
			int sum = i + j;
            i = j;
            j = sum;
            System.out.print(" "+(sum));
		}
	}
	static void pattern3(int n) {
		int i=1,num1=1,num2=2;
		System.out.print(num1+" "+num2);
		for(i=1;i<=n;i++) {
			if(i%2!=0) {
				num1+=3;
				System.out.print(" "+num1);
				
			}
			else {
				num2+=4;
				System.out.print(" "+num2);
			}
		}
	}
	
	static void pattern4(int n) {
		int i=1;
		int num1=1,num2=5,num3=8;
		System.out.print(num1+" "+num2+" "+num3+" ");
		while(i+3<=n) {
			int sum=num1+num2+num3;
			System.out.print(sum+" ");
			num1=num2;
			num2=num3;
			num3=sum;
			i+=1;
		}
	}
}
