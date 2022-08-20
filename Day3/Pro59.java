package Assignment_zsgs;
import java.util.*;
public class Pro59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String 1 ");
		String str1 = s.next();
		System.out.println("Enter String 2 ");
		String str2 = s.next();
		int count=0;
		int f=0;
		for(int i=0;i<str1.length();i++)
		{
			if(str2.charAt(0)==str1.charAt(i))
			{
				f=i;
				for(int k=0;k<str2.length();k++)
				{
					for(int j=i;j<str1.length();j++)
					{
						if(str2.charAt(k)==str1.charAt(j))
							count++;
					}
				}				
				break;
			}
		}
		//System.out.println(count);
		if(count==str2.length())
			System.out.println(f);
		else
			System.out.print(-1);
		
		s.close();
	}

}
