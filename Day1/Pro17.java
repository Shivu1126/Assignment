package Assignment_zsgs;
import java.util.*;
public class Pro17 {
//The area of the space between two concentric circles :
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	
		System.out.println("Enter the outer circle radius ");
		int out_r=s.nextInt();	//outer circle radius
		System.out.println("Enter the inner circle radius ");
		int in_r=s.nextInt();	//inner circle radius
		
		//Formula -> (pi)(out_r*out_r - in_r*in_r)
		
		float ans =(float)3.14*((out_r*out_r)-(in_r*in_r)); 
		
		System.out.println("The area of the space between two concentric circles : "+ans);
		
		s.close();
	}

}
