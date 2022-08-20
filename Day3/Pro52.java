package Assignment_zsgs;
import java.util.*;
public class Pro52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		s.close();
		int k=str.length()-1;
		int i=0;
		for(i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)==' ')
			{
				 System.out.print(rev_word(i+1,k,str)+" ");
				 k=i-1;
			}
		}
		System.out.print(rev_word(i+1,k,str));
		
	}
	static String rev_word(int start,int end,String str)
	{
		String new_word="";
		for(int i=start;i<=end;i++)
		{
			new_word+=str.charAt(i);
		}
		return new_word;
	}
}
