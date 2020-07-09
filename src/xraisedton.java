import java.io.*;
public class xraisedton {

	public static void main(String args[]) {
		int x,n,temp,ans=1;
		try {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			x= Integer.parseInt(br.readLine());
			n= Integer.parseInt(br.readLine());
			temp=0;
			while(temp<n) {
				ans*=x;
				temp+=1;
			}
			System.out.println(ans);
		}
		catch(IOException e) {
			System.out.println("Error in input");
		}
	}
}
