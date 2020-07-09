import java.util.Scanner;
import java.io.*;
public class identity {

	public static void main(String[] args) {
		int[][] matrix1=new int[3][3];
		int m,n;

		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of rows");
		m=Integer.parseInt(s.nextLine());
		System.out.println("Enter no of columns");
		n=Integer.parseInt(s.nextLine());
		System.out.println("Enter elements of matrix 1");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++) {
				matrix1[i][j]=Integer.parseInt(s.nextLine());
				
			}
		}
		int flag=1;
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				if(i==j && matrix1[i][j]!=1) {
					flag=0;
				}
				if(i!=j && matrix1[i][j]!=0) {
					flag=0;
				}
				
			}
			
		}if(flag==1) {
			System.out.println("Identity matrix");
		}
		else {
			System.out.println("Not identity matrix");
		}
		
}
}