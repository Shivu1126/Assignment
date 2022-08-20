package Assignment_zsgs;
import java.util.*;
public class Pro46 {

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
			int temp=arr[size-1];
			int j;
			for(j=size-1;j>=1;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[j]=temp;
		}
		System.out.println("Right Rotate");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		s.close();
	}

}
