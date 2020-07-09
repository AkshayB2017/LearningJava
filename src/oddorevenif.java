import java.io.*;
public class oddorevenif {

	public static void main(String[] args) {
		int number;
		try {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			number=Integer.parseInt(br.readLine());
			if(number%2==0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
		}
		catch(IOException e) {
			System.out.println("Error in input");
		}
	}
}
