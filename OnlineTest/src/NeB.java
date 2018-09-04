
public class NeB {
	public static void main(String args[]) {
		byte b;
		int i = 258;
		double d = 325.59;

		b = (byte) i;
		System.out.println(b);

		i = (int) d;
		System.out.println(i);

		b = (byte) d;
		System.out.println(b);
		
		double STATIC = 2.5 ;
		System.out.println( STATIC );
	}

}
