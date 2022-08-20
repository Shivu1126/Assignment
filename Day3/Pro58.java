package Assignment_zsgs;
import java.util.*;
public class Pro58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value ");
		int n=s.nextInt();
		int a=n,b=n+1;
		int i,j;
		for(i=1;i<=(2*n)-1;i++)
		{
			for(j=1;j<=2*n;j++)
			{
				if(j>a && j<b )
					System.out.print("_");
				else
					System.out.print("*");
			}
			if(n>i)
			{	
				a--;
				b++;
			}
			else
			{
				a++;
				b--;
			}
			System.out.println();
		} 
		
		
	}

}
