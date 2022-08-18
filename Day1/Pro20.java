package Assignment_zsgs;
import java.util.*; 
public class Pro20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter x value ");
		int x=s.nextInt();
		x = x++ * 2 + 3 * --x;
		
		// if x = 10
		/*
		 	First precedence is post and prefix increment decrements.
		 	So x++ is first evaluate..
		 		x++ = 10 and x+1->10+1 ...x=11
		 	then --x is 2nd evaluate..it is a prefix decrement..so the value is assign 
		 	at the time of evaluate.
		 		--x = 10 and x=10
		 	x = 10 * 2 + 3 * 10
		 	Above equation's first precedence is * .
		 	so... 10 * 2 = 22 and then 3 * 10 = 30
		 	now + operator is evaluate...
		 		20 + 30 = 50.
		 	x=50.		  
		 */
		s.close();
		System.out.println("x = "+x);
	}

}
