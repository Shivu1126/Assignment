package Assignment_zsgs;
import java.util.*;
public class Pro42 {

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
		
		int visited[]=new int[size];
		Arrays.fill(visited,0);
		
		System.out.println("Element   ->    Frequency");
		System.out.println("-------------------------");
		for(int i=0;i<size;i++)
		{
			int count =1;
			if(visited[i]==0)
			{
				for(int j=i+1;j<size;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						visited[j]=-1;
					}
				}
				System.out.println(arr[i]+"     ->     "+count);
			}
		}
		
		s.close();
	}

}
