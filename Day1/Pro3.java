package Assignment_zsgs;
import java.util.*;
public class Pro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int number = s.nextInt();
		int temp=number;
		int sum=0;
		while(temp>0)
		{
			int rem=temp%10;
			sum=sum*10+rem;
			temp/=10;
		}
		System.out.println(number+" - "+sum+" = "+(number - sum));
		s.close();
	}

}
