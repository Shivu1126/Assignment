package Assignment_zsgs;
import java.util.*;
public class Pro30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>=b && a>=c)
			System.out.println(a+" is Largest Value Among Three Values");
		else if(b>=a && b>=c)
			System.out.println(b+" is Largest Value Among Three Values");
		else
			System.out.println(c+" is Largest Value Among Three Values");
		s.close();
	}

}
