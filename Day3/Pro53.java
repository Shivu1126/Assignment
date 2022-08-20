package Assignment_zsgs;
import java.util.*;
public class Pro53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.next();
		
		for(int i=1;i<str.length();i+=2)
		{
			char c=str.charAt(i-1);
			String num=""+str.charAt(i);
			if(i!=str.length()-1)
			{
				if(str.charAt(i+1)<='9' && str.charAt(i+1)>='0')
				{
					num+=str.charAt(i+1);
					i++;
				}
			}
			int n=Integer.parseInt(num);
			
			for(int j=0;j<n;j++)
				System.out.print(c);
			
		}
		
		s.close();
	}
}
