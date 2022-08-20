package Assignment_zsgs;
import java.util.*;
public class Pro51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		int reverse=0;
		while(n>0)
		{
			int rem=n%10;
			reverse=reverse*10 + rem;
			n/=10;
		}
		
		System.out.println("Reverse the Number = "+reverse);
		s.close();
	}

}
