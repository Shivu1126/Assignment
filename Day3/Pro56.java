package Assignment_zsgs;
import java.util.*;
public class Pro56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value ");
		int n=s.nextInt();
		int a=1;
		s.close();

		for(int i=1;i<=n/2;i++)
		{
			for(int j=1;j<=n/2;j++)
			{					
				if((n/2)-i<j) 
				{
					System.out.print(a+" ");
					a++;
				}
				else
					System.out.print(" ");

				if(a-1==n)
					return;
			}
			System.out.println();
		}
	}

}
