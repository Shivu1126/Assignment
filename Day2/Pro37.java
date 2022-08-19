package Assignment_zsgs;
import java.util.*;
public class Pro37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter values ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println("Odd Position Numbers ");
		
		// Array index starting from 0 . 
		//So EVEN indexes are ODD position. 
		//ODD indexes are EVEN position.
		//So start from 0 and increment 2.
		for(int i=0;i<size;i+=2)
			System.out.print(arr[i]+" ");
		s.close();
		
	}

}
