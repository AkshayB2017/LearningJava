import java.util.Scanner;

public class vendor {
	public static void main(String[] args) {
		int vendor_hours, vendor_rate, extern_hours, extern_rate, net;
		String extern,hardware, software, common_use;
		//BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			Scanner s=new Scanner(System.in);
			System.out.println("Enter requested hours");
			vendor_hours= Integer.parseInt(s.nextLine());
			System.out.println("Enter requested rate");
			vendor_rate= Integer.parseInt(s.nextLine());
			System.out.println("Enter 'yes' if external vendor used");
			extern= s.nextLine();
			if(extern.equals("yes")) {
				System.out.println("Enter requested extern hours");
				extern_hours= Integer.parseInt(s.nextLine());
				System.out.println("Enter requested extern rate");
				extern_rate= Integer.parseInt(s.nextLine());
			}
			else {
				extern_hours=extern_rate=0;
			}
			System.out.println("Enter hardware/software depending on license used");
			extern= s.nextLine();
			if(extern.equals("hardware")) {
				vendor_rate*=0.7;
			}
			else if (extern.equals("software")) {
				System.out.println("Enter used/proprietary depending on usage");
				extern= s.nextLine();
				if(extern.equals("used")) {
					vendor_rate*=0.5;
				}
				else if(extern.equals("proprietary")) {
					vendor_rate=0;
				}
			}
			else {
				vendor_rate*=1;
			}
			net= (vendor_rate*vendor_hours)-(extern_rate*extern_hours);
			System.out.println(net);
			//
	}	
	
}
