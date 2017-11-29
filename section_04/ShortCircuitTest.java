public class ShortCircuitTest{
	public static void main(String[] args){
		int a = 2;
		int b = 4;

		if(( ++a > 3 ) && ( ++b > 8 )){
			System.out.println("maybe this will not executed");
		}
		// b will not changed:		
		System.out.println("a : " + a + ", b : " + b);
	}
}
