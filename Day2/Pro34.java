package Assignment_zsgs;
import java.util.*;
public class Pro34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n=s.nextInt();
		
		//sum of naturals number
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("Sum of Natural Numbers = "+sum);
		int max=0;
		while(sum>0)
		{
			int rem=sum%10;
			if(rem>max)
				max=rem;		//Find the maximum digit on sum
			sum/=10;
		}
		System.out.println("Largest digit of the Sum = "+max);
		s.close();
		
	}

}
