package Assignment_zsgs;
import java.util.*;
public class Pro18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a and b values");
		int a=s.nextInt();
		int b=s.nextInt();
		s.close();
		// i) ++a-b--
		/*if a=5 b=3
		++a is prefix increment so it is increment on the line.so a=6
		b-- is post decrement so it is first assume the value is 3.
		then b is b-1.so b=3 on this line.
		Answer is 6-3=3
		*/
		System.out.println("i) ++a-b-- = "+(++a-b--));
		
		// ii)a%b++
		/*Now a=6 b=2
		 	this equation's first precedence is ++ operator.so first this is evaluate.
		 	but this is post increment.so value is increase in next line.now b=2.
		  	so 6%2 = 0.  At last b=3 
		*/
		System.out.println("ii) a%b++ = "+(a%b++));
		
		//iii)a*=b+5
		/*Now a=6 b=3
		 	this equation's last precedence is ++ operator.so first b+5 is evaluate.
		 	so a=a*8. a=6*8. Now a is 48
		 
		 */
		a*=b+5;
		System.out.println("iii) a*=b+5 -> a = "+a);
		
		//iv)x=69>>>2
		/*	Right shift	69>>>2
		 		64 32 16 8 4 2 1
		 69->	1  0  0  0 1 0 1		
	69>>>2		-  -  1  0 0 0 1			
		 
		 new -> 0  0  1  0 0 0 1	-> decimal value ->17
		 so x=17
		 */
		
		System.out.println("iv) x=69>>>2 => "+(69>>>2));
	}

}
