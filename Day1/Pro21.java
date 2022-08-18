package Assignment_zsgs;

public class Pro21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y=10;
		int z=(++y * (y++ + 5));
		/*
			++y is 10+1 = 11 . it is a prefix increment..so the value is assign 
		 	at the time of evaluate.
			
			y++ is 11+1=12. it is a post increment..so the value is assign 
		 	at after the evaluate.
		 	
		 	so y++ = 11..and y=12
			
			Then (y++ + 5) 11 + 5 = 16 
			
		 	Now 11 * 16 = 176
		 */
		System.out.println("z = "+z);
		System.out.println("y = "+y);
	}

}
