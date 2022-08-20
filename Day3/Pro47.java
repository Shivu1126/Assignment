package Assignment_zsgs;
import java.util.*;
public class Pro47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value ");
		int n=s.nextInt();
		long p=1;
		s.close();
		//With Math Calculation
		System.out.println("With Math Calculation");
		for(int i=0;i<n;i++)
		{
			for(int k=n-1;k>i;k--)
			{
				System.out.print(" ");
			}
			long k= p*p;
			System.out.print(k);
			p=(p*10)+1;
			System.out.println();
		}
		System.out.println();
		System.out.println("Without Math Calculation(for loop only)");
		
		int t=0;
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>i;k--)
			{
				System.out.print("  ");
			}
			int temp=0;
			for(int j=1;j<=t+i;j++)
			{
				
				if(j<=i)
				{
					System.out.print(j+" ");
					temp=j;
				}
				else
				{
					temp--;
					System.out.print(temp+" ");
				}
			}
			t++;
			System.out.println();
		}
	}

}
