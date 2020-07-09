import java.io.*;
import java.util.Scanner;

public class studentmarks {
	public static void main(String[] args) {
		String name;
		int mark1,mark2,mark3,average,total;
		//BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			Scanner s=new Scanner(System.in);
			name= s.nextLine();
			mark1= Integer.parseInt(s.nextLine());
			mark2= Integer.parseInt(s.nextLine());
			mark3= Integer.parseInt(s.nextLine());
			total=(mark1+mark2+mark3);
			average=total/3;
			//System.out.println(average);
			if(average>60) {
				System.out.println("First class");
				
			}
			else if(average>50 && average<60) {
				System.out.println("Second class");
			}
			else if(average>35 && average<50) {
				System.out.println("Pass class");
				
			}
			else {
				System.out.println("fail");
			}
		
	}
	
}
