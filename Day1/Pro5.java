package Assignment_zsgs;
import java.util.*;
public class Pro5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter character ");
		char c=s.next().charAt(0);
		
		//change lowercase to uppercase
		if(c>='a' && c<='z')
			c-=32;		//32 is different between ascii value of small character to capital character
		
		for(char i=c;i>='A';i--)
		{
			for(char j=i;j>='A';j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		s.close();
	}

}
