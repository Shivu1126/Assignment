package Assignment_zsgs;
import java.util.*;
public class Pro4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int a=s.nextInt();
		int b=s.nextInt();
		
		//Bitwise OR
		System.out.println("Bitwise OR-> a|b = "+a+"|"+b+"="+(a|b));
		/*Bitwise OR Table
		 * a	b	a|b
		 * 0	0	0
		 * 0	1	1
		 * 1	0	1
		 * 1	1	1
		 * 
		 * if a=3 b=4
		 * 
		 * a-> 0 0 1 1
		 * b-> 0 1 0 0
		 * 
		 * a|b -> 0 1 1 1 = 7 
		 */
		
		//Bitwise AND
		System.out.println("Bitwise AND-> a&b = "+a+"&"+b+"="+(a&b));
		/*Bitwise AND Table
		 * a	b	a&b
		 * 0	0	0
		 * 0	1	0
		 * 1	0	0
		 * 1	1	1
		 * 
		 * if a=3 b=4
		 * 
		 * a-> 0 0 1 1
		 * b-> 0 1 0 0
		 * 
		 * a|b -> 0 0 0 0 = 0 
		 */
		
		//Bitwise XOR
		System.out.println("Bitwise XOR-> a^b = "+a+"^"+b+"="+(a^b));
		/*Bitwise XOR Table
		 * a	b	a|b
		 * 0	0	0
		 * 0	1	1
		 * 1	0	1
		 * 1	1	0
		 * 
		 * if a=3 b=4
		 * 
		 * a-> 0 0 1 1
		 * b-> 0 1 0 0
		 * 
		 * a|b -> 0 1 1 1 = 7 
		 */
		
		//Bitwise Compliment
		System.out.println("Bitwise Compliment-> ~a and ~b = ~"+a+"="+(~a)+" ~"+b+"="+(~b));
		//a=~a -> -(a+1)	if a = 3	~3=-(3+1)=-4
		//b=~b -> -(b+1)	if a = 4	~4=-(4+1)=-5
		
		System.out.println("Left shift a<<2 -> "+a+"<<2 = "+(a<<2));
		/*
		 * a=3  leftshift  3<<2
		 * 		32 16 8 4 2 1	
		 * a->	0  0  0 0 1 1
		 *a<<2	0  0  1 1 _ _
		 *
		 *new   0  0  1 1 0 0 = 12
		 * 
		 */
		
		System.out.println("Right shift b>>2 -> "+b+">>2 = "+(b>>2));
		/*
		 * b=4  rightshift  4>>2
		 * 		32 16 8 4 2 1	
		 * b->	0  0  0 1 0 0
		 *b>>2	_  _  0 0 0 1
		 *
		 *new   0  0  0 0 0 1 = 1
		 * 
		 */
		
		s.close();
	}

}
