package Assignment_zsgs;
import java.util.*;
public class Pro41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size ");
		int size=s.nextInt();
		int arr1[]=new int[size];
		int arr2[]=new int[size];
		System.out.println("Enter values ");
		//Without Function
		for(int i=0;i<size;i++)
		{
			arr1[i]=s.nextInt();
			arr2[i]=arr1[i];	//Copy the value of arr1[i] to arr2[i]
		}
		System.out.println("Without Function :");
		System.out.println();
		System.out.println("1st array values");
		for(int i=0;i<size;i++)
			System.out.print(arr1[i]+" ");
		System.out.println();
		System.out.println("2nd array values");
		for(int i=0;i<size;i++)
			System.out.print(arr2[i]+" ");
		System.out.println();
		//With function
		arr2=Arrays.copyOf(arr1, size); // This function is copy the all elements of arr1 to arr2
		
		System.out.println("With Function");
		System.out.println();
		System.out.println("1st array values");
		for(int i=0;i<size;i++)
			System.out.print(arr1[i]+" ");
		System.out.println();
		System.out.println("2nd array values");
		for(int i=0;i<size;i++)
			System.out.print(arr2[i]+" ");
		
		s.close();
	}

}
