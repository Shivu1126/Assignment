package Assignment_zsgs;
import java.util.*;
public class Pro32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number ");
		int n=s.nextInt();
		if(n>0)
			System.out.println(n+" is Positive");
		else if(n<0)
			System.out.println(n+" is Negative");
		else
			System.out.println(n+" is Zero");
		s.close();
	}

}
