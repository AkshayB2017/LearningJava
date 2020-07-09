import java.io.*;
import java.language.*;
public class dectobin {
public static void main(String args[]) {
	int decimal,remainder;
	StringBuilder binary = new StringBuilder("");
	try {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		decimal= Integer.parseInt(br.readLine());
		while(decimal>0)
		{ remainder=decimal%2;
		  binary.append(remainder);
		  binary.reverse();
		   decimal/=2;
			
		}
		System.out.println(binary);
	}
	catch(IOException e) {
		System.out.println("Error in input");
	}
}
}
