public class EqualTest{
	public static void main(String[] args){
		String str1= "Hello";
		String str2= new String("Hello");
		String str3= str1;
		String str4= str2;

		System.out.println("== 관계");
		System.out.println("str1 == str1 : " +(str1==str1));
		System.out.println("str1 == str2 : " +(str1==str2));
		//str1과 str2의 주소값이 다르므로 false
		
		System.out.println("str1 == str3 : " +(str1==str3));
		//str3는 str1을 복사한 변수
		//
		System.out.println("str2 == str4 : " +(str2==str4));
		//str4는 str2를 복사한 변수
		//
		System.out.println();

		System.out.println("Equal 관계");
		System.out.println("str1 equals str1 : " + (str1.equals(str1)));
		System.out.println("str1 equals str2 : " + (str1.equals(str2)));
		System.out.println("str1 equals str3 : " + (str1.equals(str3)));
		System.out.println("str1 equals str4 : " + (str1.equals(str4)));
	}
}
