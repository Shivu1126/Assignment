package Assignment_zsgs;
import java.util.*;
public class Pro55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value ");
		int n=s.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || j==0 || i==n-1)
					System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}

}
