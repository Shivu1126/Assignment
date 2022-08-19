package Assignment_zsgs;

import java.util.*;

public class Pro45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter values ");
		int sum=0;
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum of all elements = "+sum);
		s.close();
		
	}

}
