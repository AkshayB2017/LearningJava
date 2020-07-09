import java.io.*;
public class swap {
  public static void main(String[] args) {
	  int a,b,temp;
	  try {
		  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		  a= Integer.parseInt(br.readLine());
		  b= Integer.parseInt(br.readLine());
		  temp=a;
		  a=b;
		  b=temp;
		  System.out.println("a and b:"+a+','+b);
		  
	  }
	  catch(IOException e)
	  {
		 System.out.println("Error in input");
	  }
  }
}
