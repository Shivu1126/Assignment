package Assignment_zsgs;
import java.util.*;
public class Pro60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Input the number of terms ");
		int  n=s.nextInt();
		
		int p=1,sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=p;
			p=(p*10)+1;			
		}
		System.out.print(sum);
		s.close();
	}
}
