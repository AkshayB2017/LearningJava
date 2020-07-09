import java.io.*;
public class oddoreven {
  public static void main(String[] args) {
	  int a;
	  String result;
	  try {
	  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	  a=Integer.parseInt(br.readLine());
	  result= a%2==0? "Even": "Odd";
	  System.out.println(result);
	  }
	  catch(IOException e) {
		  System.out.println("Error in input");
	  }
  }
}
