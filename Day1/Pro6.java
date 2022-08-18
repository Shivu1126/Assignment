package Assignment_zsgs;
import java.util.*;
public class Pro6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter total number of students");
		int total=s.nextInt();
		System.out.println("Enter number of gorup ");
		int group=s.nextInt();
		for(int i=1;i<=group;i++)
		{
			System.out.println("Group "+i);
			for(int j=i+100;j<=100+total;j+=group)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		s.close();
	}

}
