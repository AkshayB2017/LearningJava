import java.io.*;
import java.util.Scanner;

public class reversenum {
	
	public static void main(String args[]) {
		int number,reverse=0;
		Scanner s= new Scanner(System.in);
		number= Integer.parseInt(s.nextLine());
		int i=1, temp=number;
		while(number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
		System.out.println(reverse);
	}
}