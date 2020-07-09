import java.io.*;
import java.util.Scanner;

public class generatepattern {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=Integer.parseInt(s.nextLine());
		int i,j,num=0,sign=1,number;
		for(i=0;i<=n;i++) {
			for(j=0;j<i;j++) {
				System.out.print(sign*((num+1)*(num+1))+" ");
				num+=1;
				sign*=-1;
			} System.out.print("\n");
		}
	 num=1;
	 number=1;
		for(i=0;i<n;i++) {
			for(j=0;j<i;j++) {
				System.out.print(number+" ");
				number=(number)*(num);
				num+=1;
			}System.out.print("\n");
		}
	   
	}
}
