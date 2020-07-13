import java.io.*;
import java.util.Scanner;
public class primenumberarray {

	public static void main(String args[]) {
		//Identify the variables
		int lowerLimit;
		int upperLimit;
		int i;
		int count;
		int temp;
		int[] prime=new int[100];
		//Initialize variables
		lowerLimit=10;
		upperLimit=100;
		i=0;
		count=0;
		
		//Traverse limits to identify the numbers
		temp=lowerLimit;
		while(temp<=upperLimit) {
			i=1;
			count=0;
			while(i<=temp) {
			if(lowerLimit%i==0) {
				count++;
			}i++;
		}
		if(count<=2) {
			System.out.println(temp);
		}temp++;
	}
	}
}