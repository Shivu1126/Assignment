package Assignment_zsgs;
import java.util.*;
public class Pro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number ");
		int number=s.nextInt();
		System.out.println(" Multiplication Table ");
		for(int i=1;i<=15;i++)
		{
			System.out.println(i+" * "+number+" = "+(i*number));
		}
		System.out.println();
		System.out.println(" Substruction Table ");
		for(int i=1;i<=number;i++)
		{
			System.out.println(number+" - "+i+" = "+(number-i));
		}
		s.close();
	}

}
