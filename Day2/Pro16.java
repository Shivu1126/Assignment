package Assignment_zsgs;
import java.util.*;
public class Pro16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a,b and c values");
		double a=s.nextInt();
		double b=s.nextInt();
		double c=s.nextInt();
		
		double temp= b*b - 4*a*c;	//square(b) - 4ac
		if(temp<0)
			temp=-temp;
		
		double x1=((-b + Math.sqrt(temp))/2*a);	//-b + root(square(b) - 4ac)
		double x2=((-b - Math.sqrt(temp))/2*a);	//-b - root(square(b) - 4ac)
		
		System.out.println("Output 1 = "+x1);
		System.out.println("Output 2 = "+x2);
		
		s.close();
	}

}
