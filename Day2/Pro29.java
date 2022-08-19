package Assignment_zsgs;
import java.util.*;
public class Pro29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Character");
		char c=s.next().charAt(0);
		if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
			System.out.println(c+" is a Vowel");
		else
			System.out.println(c+" is a Consonant");
		s.close();
	}

}
