package Assignment_zsgs;
import java.util.*;
public class Pro31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a,b and c");
		double a=s.nextInt();
		double b=s.nextInt();
		double c=s.nextInt();
		
		double temp = b*b - 4*a*c;	//square(b) - 4ac
		double root1,root2;
		if(temp>0)
		{
			root1 = (-b + Math.sqrt(temp))/2*a; //-b + root(square(b) - 4ac)
			root2 = (-b - Math.sqrt(temp))/2*a; //-b - root(square(b) - 4ac)
			System.out.println("Root 1 = "+root1);
			System.out.println("Root 2 = "+root2);
		}
		else if(temp==0)
		{
			root1 = root2 = -b/(2*a); //If temp = 0 ...The root value is 0 .So we not consider that. 
			System.out.println("Root 1 = "+root1);
			System.out.println("Root 2 = "+root2);
		}
		else	
		{
			double real = -b/(2*a);
			double imgr = Math.sqrt(-temp)/(2*a);
			System.out.println("Root 1 = "+real+" + "+imgr+"i");
			System.out.println("Root 2 = "+real+" - "+imgr+"i");
		}
		
		s.close();
	}

}
