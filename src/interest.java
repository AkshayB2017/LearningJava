import java.io.BufferedReader;
import java.io.*;
public class interest {
	public static void main(String[] args) {
        float p,r,s;
        int n;
        try
        {
        	System.out.println("Enter values of p,n and r");
        	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        	p= Float.parseFloat(br.readLine());
        	n= Integer.parseInt(br.readLine());
        	r= Float.parseFloat(br.readLine());
        	s=(p*n*r)/100;
        	System.out.println("simple interest="+s);
    }
	 catch(IOException e) {
		 System.out.println("Error in input");
		 
	 }
}
}