import java.io.*;
import java.util.Scanner;
public class sumofodd {
public static void main(String[] args) {
	int number,sum=0;
	Scanner s= new Scanner(System.in);
	number= Integer.parseInt(s.nextLine());
	int i=1;
	while(i<=number) {
		sum+=i;
		i+=2;
	}
	System.out.println(sum);
}
}
