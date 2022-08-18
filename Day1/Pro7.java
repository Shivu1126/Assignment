package Assignment_zsgs;
import java.util.*;
public class Pro7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.next();
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(i==j || i==str.length()-j-1)
					System.out.print(str.charAt(i));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		s.close();
	}

}
