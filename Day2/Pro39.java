package Assignment_zsgs;
import java.util.*;
public class Pro39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=s.nextInt();
		int arr[]=new int[size];
		int min=0;
		System.out.println("Enter values ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
			if(i==0)
				min=arr[i];	//First I take the 1st element of the array is minimum
			if(arr[i]<min)	//Then I check it which is less than
				min=arr[i]; //If condition is true then value of 'arr[i]' is assign to the 'min'
		}
		System.out.println("Smallest element in array = "+min);
		s.close();
	}

}
