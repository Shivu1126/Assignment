package Assignment_zsgs;
public class Pro19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=28;
		a*=a++ + ++a + --a + a--;
		
		//Last precedence is *= .so...
		//a++ = 28 and a=29
		//++a = 30 and a=30
		//--a = 29 and a=29
		//a-- = 29 and a=28
		// Now a=28
		//a+= 28 + 30 + 29 + 29 
		//a=a+116....a=28+116...a=144
		
		System.out.println("a = "+a);
		
	}

}
