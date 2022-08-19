package Assignment_zsgs;
import java.util.*;
public class Pro33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Character");
		char c=s.next().charAt(0);
		if((c>='A' && c<='Z')||(c>='a' && c<='z'))
			System.out.println(c+" is Alphabet");
		else
			System.out.println(c+" is Not Alphabet");
		s.close();
	}

}
