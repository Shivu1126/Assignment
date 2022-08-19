package Assignment_zsgs;
import java.util.*;
public class Pro11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter row and column value ");
		int row=s.nextInt();
		int column=s.nextInt();
		int arr[][]=new int[row][column];
		
		System.out.println("Enter values ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Enter target to left rotate");
		int target=s.nextInt();
		for(int t=0;t<target;t++)
		{
			for(int i=0;i<row;i++)
			{
				int temp=arr[i][0];
				int j;
				for(j=0;j<column-1;j++)
				{
					arr[i][j]=arr[i][j+1];
				}
				arr[i][j]=temp;
			}
		}
		System.out.println("Multidimensional array Left Rotate");
		
		for(int i=0;i<row;i++)
		{
			for(int l=0;l<column;l++)
				System.out.print(arr[i][l]+" ");
			System.out.println();
		}
		s.close();
	}

}
