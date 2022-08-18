package Assignment_zsgs;

public class Pro26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long a = 10902480;
		long b = 8925798754097L;
//You must specific the L or l at the last of long value when long variable is above 8 digits...
		long c=6647005016989014785l; 
		//Long variable accept the 19 digits Number. Include Negative Number.
		
		//Long range

		//Long take 8 byte -> 64 bit
		long min=(long)Math.pow(2,64)+1;
		long max=(long)Math.pow(2, 64);
		
		System.out.println("Minimum Long : "+(-min));
		System.out.println("Maximum Long : "+max);

	}

}
