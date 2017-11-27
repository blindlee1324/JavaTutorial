import java.util.Random;

public class RandomTest{
	public static void main(String[] args){
		Random r = new Random();

		System.out.println("0~99 범위의 난수(java.util.Random): " + Math.abs(r.nextInt() % 100));
		System.out.println("0~99 범위의 난수(java.lang.Math): " + (int)(Math.random()*100));

	}
}
