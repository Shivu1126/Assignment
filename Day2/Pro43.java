package Assignment_zsgs;
import java.util.*;
public class Pro43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter values ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the target of rotate ");
		int target=s.nextInt();
		
		for(int i=0;i<target;i++)
		{
			int temp=arr[0];
			int j;
			for( j=0;j<size-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=temp;			
		}
		
		System.out.println("Left Rotate");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		
		s.close();
	}

}
