import java.io.*;
import java.util.Scanner;
public class pattern {

	public static void main(String[] args) {
		int n;
		Scanner s= new Scanner(System.in);
		n=Integer.parseInt(s.nextLine());
		int i,j;
		int temp=n-1;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i+j>=temp) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			} System.out.print("\n");
		}
       
  
       for(i=0;i<n;i++) {
    	   for(j=0;j<i+1;j++) {
    		   System.out.print(i+1);
    	   }
    	   System.out.print("\n");
       }
       for(i=0;i<n;i++) {
           int counter=1;

    	   for(j=0;j<i+1;j++) {
    		   System.out.print(counter+" ");
    		   counter++;
    	   }
    	   System.out.print("\n");
       }
       
       int counter=1;
       for(i=0;i<n;i++) {
          

    	   for(j=0;j<i+1;j++) {
    		   System.out.print(counter+" ");
    		   counter++;
    	   }
    	   System.out.print("\n");
       }
       int counter1=1, counter2=1;
       for(i=0;i<n;i++) {
          

    	   for(j=0;j<i+1;j++) {
    		   System.out.print(counter1+" ");

               int sum = counter1 + counter2;
               counter1 = counter2;
               counter2 = sum;
    	   }
    	   System.out.print("\n");
       }
       
       
			}
	}
	

