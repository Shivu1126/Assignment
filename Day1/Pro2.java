package Assignment_zsgs;
import java.util.*;
public class Pro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter character ");
		char c=s.next().charAt(0);
		
		//change lowercase to uppercase
		if(c>='a'&&c<='z')
		{
			c-=32;		//32 is different between ascii value of small character to capital character
		}
		
		for(char i=c;i<='Z';i++)
		{
			System.out.print(i+" ");
		}
		s.close();
	}

}
