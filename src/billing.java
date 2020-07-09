import java.io.*;
import java.util.Scanner;
public class billing {
	public void pw(double n, String ch)
	{
		String one[] = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
				" Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
				" Nineteen" };
 
		String ten[] = { " ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", " Ninety" };
 
		if (n > 19)
		{
			System.out.print(ten[(int)n / 10] + " " + one[(int)n% 10]);
		}
		else
		{
			System.out.print(one[(int)n]);
		}
		if (n > 0)
			System.out.print(ch);
	}
	
	
	public static void main(String[] args) {
		double total=0;
		Scanner s= new Scanner(System.in);
		int value, quantity, price;
		String item_code, description;
		String more="yes";
		String card;
		while(more.equals("yes"))
		{
		System.out.println("Enter item code");
		item_code= s.nextLine();
		System.out.println("Enter description (one line)");
		description= s.nextLine();
		System.out.println("Enter quantity");
		quantity= Integer.parseInt(s.nextLine());
		System.out.println("Enter price");
		price= Integer.parseInt(s.nextLine());
		total+=(price*quantity);
		System.out.println("More items to insert?(yes/no");
		more=s.nextLine();
		}
		System.out.println("Card used for payment?(yes/no");
		card=s.nextLine();
		if(total>10000) {
			total=total*0.9;
		}
		if(card.equals("yes")) {
			if(total<1000) {
				total+=0.025*total;
			}
		}
        System.out.print(total);
        
		
		
		
	}
}
