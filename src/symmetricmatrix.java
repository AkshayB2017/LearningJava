import java.util.Scanner;
public class symmetricmatrix{
	

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
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++) {
				if(matrix1[i][j]!=matrix1[j][i]) {
					flag=0;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.print("Not symmetric");
		}
			else {
				System.out.print("Symmetric");
			}
		}
}