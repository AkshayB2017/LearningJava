import java.io.*;
public class bintodec {
public static void main(String args[]) {
	int binary,multiplier=0;
	try {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		binary= Integer.parseInt(br.readLine());
		int num = binary; 
        int dec_value = 0; 
        int base = 1; 
        int temp = num; 
        while (temp > 0) { 
            int last_digit = temp % 10; 
            temp = temp / 10; 
  
            dec_value += last_digit * base; 
  
            base = base * 2; 
        } 
         System.out.println(dec_value);
 		
	}
	catch(IOException e) {
		System.out.println("Error in input");
		
	}
	
}
	
}
