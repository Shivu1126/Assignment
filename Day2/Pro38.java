package Assignment_zsgs;
import java.util.*;
public class Pro38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=s.nextInt();
		int arr[]=new int[size];
		int max=0;
		System.out.println("Enter values ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
			if(arr[i]>max)		// check what is greater than
				max=arr[i];		
			//If condition is true then value of 'arr[i]' is assign to the 'max'
		}
		System.out.println("Largest element in array = "+max);
		s.close();
		
	}

}
