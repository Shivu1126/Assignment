package Assignment_zsgs;
import java.util.*;
public class Pro9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
		System.out.println("Enter array sizes");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		int arr3[]=new int[n1+n2];
		
		System.out.println("Enter 1st array values ");
		int i=0;
		for(i=0;i<n1;i++)
		{
			arr1[i]=s.nextInt();
			arr3[i]=arr1[i];
		}
		int temp=i;
		System.out.println("Enter 2nd array values");
		int j;
		for( j=0;j<n2;j++)
		{
			arr2[j]=s.nextInt();
			int t=0;
			for(int k=0;k<n1;k++)
			{
					if(arr2[j]!=arr1[k])
						t++;
			}
			if(t==n1)
				arr3[temp++]=arr2[j];
		}		
		for(int k=0;k<temp;k++)
			System.out.print(arr3[k]+" ");

		s.close();
	}

}
