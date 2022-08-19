package Assignment_zsgs;

public class Pro23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		
		//x1 = ++x - x++ + --x
		//++x is prefix increment so x+1=6, x=6
		//x++ is post increment so x=6 in this increment then x=x+1 x=7
		//--x is prefix decrement so x-1=6, x=6
		//x1 = 6 - 6 + 6 = 6
		
		int x1= ++x -x++ + --x;
		System.out.println("x1 = "+x1);
	}

}
