package Assignment_zsgs;
import java.util.*;
public class Pro54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size ");
		int size=s.nextInt();		
		int arr[]=new int[size];
		System.out.println("Enter array values ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		int temp;
		//Odd position Descending
		for(int i=1;i<size;i+=2)
		{
			for(int j=i+2;j<size;j+=2)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//Even position Ascending
		for(int i=0;i<size;i+=2)
		{
			for(int j=i+2;j<size;j+=2)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		s.close();
	}

}
