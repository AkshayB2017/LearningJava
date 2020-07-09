import java.io.*;
import java.util.Scanner;
public class matrixoperation {

	public static void main(String[] args) {
		int[][] matrix1=new int[3][3];
		int[][] matrix2=new int[3][3];
		int[][] matrix3=new int[3][3];

		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter elements of matrix 1");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++) {
				matrix1[i][j]=Integer.parseInt(s.nextLine());
				
			}
		}
		System.out.println("Enter elements of matrix 2");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++) {
				matrix2[i][j]=Integer.parseInt(s.nextLine());
				
			}
		}
		System.out.println("Addition");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++) {
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
				
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++) {
				System.out.print(matrix3[i][j]+" ");
			}System.out.print("\n");
		}
		System.out.println("Subtraction");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++) {
				matrix3[i][j]=matrix1[i][j]-matrix2[i][j];
				
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++) {
				System.out.print(matrix3[i][j]+" ");
			}System.out.print("\n");
		}
		System.out.println("Multiplication");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					matrix3[i][j]=matrix1[i][k]*matrix2[k][j];
						
				}
				
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++) {
				System.out.print(matrix3[i][j]+" ");
			}System.out.print("\n");
		}
	}
}
