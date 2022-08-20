package Assignment_zsgs;

import java.util.*;

public class Pro48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value ");
		int n=s.nextInt();
		int t=0;
		for(int i=n;i>=1;i--)
		{ 
			for(int k=n-1;k>n-i;k--)
			{
				System.out.print("  ");
			}
			int temp=0;
			for(int j=i;j<=t+n;j++)
			{
				if(j<=n)
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
		s.close();

	}

}
