package Assignment_zsgs;
import java.util.*;
public class Pro35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n=s.nextInt();
		
		int sum=1;
		for(int i=1;i<=n;i++)
			sum*=i;					//Factorial of n
		System.out.println("Factorial of "+n+" = "+sum);
		
		//sum of digit
		int digit=0;
		while(sum>0)
		{
			int rem=sum%10;
			digit+=rem;
			sum/=10;
		}
		
		System.out.println("Factorial Number's Sum of digits = "+digit);
		s.close();		
	}

}
