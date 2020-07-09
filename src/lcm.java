import java.io.*;
public class lcm {

	public static void main(String[] args) {
		long num1,num2,lcm,temp,i=2,res;
		try {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			num1= Long.parseLong(br.readLine());
			num2= Long.parseLong(br.readLine());
			if(num1>num2)
				res=num1;
			  else
				res=num2;
			   temp=res;
			   while(res%num1!=0 || res%num2!=0)
				{
				res=temp*i;
				i++;
				}
	
		 System.out.println(res);
		}
		catch(IOException e) {
			System.out.println("Input error");
		}
	}
}
