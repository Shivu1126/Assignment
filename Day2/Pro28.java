package Assignment_zsgs;
import java.util.*;
public class Pro28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=s.nextInt();
		if(n%2==0)
			System.out.println(n+" is Even Number");
		else
			System.out.println(n+" is Odd Number");
		s.close();
	}

}
