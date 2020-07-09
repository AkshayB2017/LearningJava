import java.io.*;
import java.util.Scanner;
public class mathproblem {

	public static void main(String[] args) {
		int num=1, counter=1;
		while(true) {
		  if(num%7==0 && num%6==1 && num%5==1 && num%4==1 && num%3==1 && num%2==1) {
			    if(counter==1 || counter==2 || counter==4) {
			    	System.out.println(num);
			    	
		  }counter+=1;
		  
		}num+=1;
	}
}
}
