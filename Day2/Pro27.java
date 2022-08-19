package Assignment_zsgs;
import java.util.*;
public class Pro27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a and b values ");
		int a=s.nextInt();
		int b=s.nextInt();
		
		System.out.println("Before swap \n a = "+a+"\n b = "+b);
		System.out.println("After swap");
		
		System.out.println("a = "+((a^b)^a));
		System.out.println("b = "+((b^a)^b));
		
		/*Bitwise XOR Table
		 * a	b	a^b
		 * 0	0	0
		 * 0	1	1
		 * 1	0	1
		 * 1	1	0
		 * 
		 * if a=3 b=4
		 * 
		 * a->	0 0 1 1
		 * b->  0 1 0 0 	
		 * ------------
		 * a^b  0 1 1 1		Then (a^b)^a
		   a->  0 0 1 1
		   ------------
	   (a^b)^a	0 1 0 0  -> 3	so b value =  3 
		 * 
		 * Same process in (b^a)^b . So a value = 4
		 */
		
		s.close();
		
	}

}
