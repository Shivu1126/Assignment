package Assignment_zsgs;
import java.util.*;
public class Pro57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String ");
		String str = s.next();
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(i==j || str.length()-i-1==j)
					System.out.print(str.charAt(j));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		s.close();
	}

}
