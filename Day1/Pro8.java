package Assignment_zsgs;
public class Pro8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car c1=new car("A4ch2014",350000);
		car c2=new car("Super250",200000);
		c1.display();
		c2.display();
		//Before changing brand name is BMW

		car.change();	//Don't create object for static method .
				//And then If you change the static variable value..It is changed in all objects.
		//after changing brand name is Audi
		System.out.println("Brand changed");
		System.out.println();
		c1.display();		
		c2.display();
	}
}
class car
{
	String model;
	int price;
	static String brandName="BMW";
	car(String m,int p)
	{
		model=m;
		price=p;
	}
	static void change()
	{
		brandName="Audi";
	}
	void display()
	{
		System.out.println("Model name : "+model);
		System.out.println("     Price : "+price);
		System.out.println("Brand Name : "+brandName);
		System.out.println();
	}
}

//OUTPUT
//Model name : A4ch2014
//Price : 350000
//Brand Name : BMW
//
//Model name : Super250
//Price : 200000
//Brand Name : BMW
//
//Brand changed
//
//Model name : A4ch2014
//Price : 350000
//Brand Name : Audi
//
//Model name : Super250
//Price : 200000
//Brand Name : Audi
