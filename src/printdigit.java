import java.io.*;
import java.util.Scanner;
public class printdigit {
public static void main(String[] args) {
	long number,remainder,quotient;
	String word="";
	Scanner s=new Scanner(System.in);
	number= Long.parseLong(s.nextLine());
	long temp=number;
	while(temp>0) {
		remainder=temp%10;
		if(remainder==1) {
			word+="One ";
		}
		else if(remainder==2) {
			word+="Two ";
		}
		else if(remainder==3) {
			word+="Three ";
		}
		else if(remainder==4) {
			word+="Four ";
		}
		else if(remainder==5) {
			word+="Five ";
		}
		else if(remainder==6) {
			word+="Six ";
		}
		else if(remainder==7) {
			word+="Seven ";
		}
		else if(remainder==8) {
			word+="Eight ";
		}
		else if(remainder==9) {
			word+="Nine ";
		}
		else if(remainder==0) {
			word+="Zero ";
		}
		temp/=10;
	}
	System.out.println(word);
}
}
