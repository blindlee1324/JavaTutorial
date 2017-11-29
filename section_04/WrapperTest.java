public class WrapperTest{
	public static void main(String[] args){
		int myInt = 5316;
		System.out.println("myInt = " + myInt);

		String myString = new Integer(myInt).toString();

		myString = myString.replace('6', '4');

		float myFloat = Float.valueOf(myString).floatValue();
		System.out.println("myFloat = " + myFloat);

		System.out.println("2 + 2 = " + 2+2);
	}
}
