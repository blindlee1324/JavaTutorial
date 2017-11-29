public class RadixTest{
	public static void main(String[] args){
		String num = "11";

		try{
			int bin = Integer.parseInt(num, 2);
			int oct = Integer.parseInt(num, 8);
			int dec = Integer.parseInt(num, 10);
			int hex = Integer.parseInt(num, 16);

			System.out.println("주어진 값 : " + num);
			System.out.println("2진수일 때 : " + bin);
			System.out.println("8진수일 때 : " + oct);
			System.out.println("10진수일 때 : " + dec);
			System.out.println("16진수일 때 : " + hex);

		} catch(NumberFormatException e){
			System.out.println("Error: " + e);	
		}
	}
}
