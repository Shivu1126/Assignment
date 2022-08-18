package Assignment_zsgs;
import java.util.*;
public class Pro10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter values");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
	
		Arrays.sort(arr);
		
		int i=0,j=size-1;
	
		while(i<j)
		{
			System.out.printf("%d ",arr[j--]);
			System.out.printf("%d ",arr[i++]);	
		}
		if( size%2 != 0 )
		{
			System.out.printf("%d ",arr[i]);	
		}
		s.close();
	}

}
