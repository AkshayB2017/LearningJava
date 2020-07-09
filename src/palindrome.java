import java.io.*;
import java.util.Scanner;
public class palindrome {

	public static void main(String args[]) {
		String input,palindrome="";
			Scanner s = new Scanner(System.in);
			input=s.nextLine();
			int n=input.length();
			for(int i=n-1;i>=0;i--) {
			  palindrome+=input.charAt(i);
			}
			if(input.equalsIgnoreCase(palindrome)) {
				System.out.println("Palindrome");
			}
			else {
				System.out.println("Not palindrome");
			}
		}
	}
	

