import java.io.*;
public class splitnumber {

	public static void main(String[] args) {
		double number;
		int whole;
		float fraction;
		try {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			number= Double.parseDouble(br.readLine());
			int integer = (int)number;
			double decimal = (10 * number - 10 * integer)/10;
             System.out.println("integer and decimal:"+integer+','+decimal);
		}
		catch(IOException e) {
			System.out.println("Error in input");
		}
	}
}
