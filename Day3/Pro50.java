package Assignment_zsgs;
import java.util.*;
public class Pro50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value ");
		int n=s.nextInt();
		
		for(int i=n;i>=1;i--)
		{
			for(int k=n;k>i;k--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print(i+" ");			
			System.out.println();
		}
		s.close();
	}

}
