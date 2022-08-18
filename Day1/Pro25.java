package Assignment_zsgs;
import java.util.*;
public class Pro25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Dividend ");
		int dd=s.nextInt();
		System.out.println("Enter the Divisor ");
		int ds=s.nextInt();
		
		System.out.println("Quotient of '"+dd+"' is "+dd/ds);
		System.out.println("Reminder of '"+dd+"' is "+dd%ds);
		
		s.close();
	}

}
