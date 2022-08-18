package Assignment_zsgs;
import java.util.*;
public class Pro15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Radius value");
		float r=s.nextFloat();
		System.out.println("Enter Height value");
		float h=s.nextFloat();
		
		//BASE AREA
		float ba=(float) (2*3.14*(r*r));		//  2(pi)r*r
		System.out.println("Base area of Cylinder : "+ba);
		
		//Curved Surface Area
		float csa=(float)(2*3.14*r*h);			// 2(pi)r*h
		System.out.println("Curved Surface Area : "+csa);
		
		//Total Surface Area
		float area=ba+csa;	//BASE AREA + Curved Surface Area
		System.out.printf("Total Surface Area : %.2f",area);
		s.close();
	}

}
