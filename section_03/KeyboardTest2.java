import java.util.Scanner;

//Use Scanner
public class KeyboardTest2{
	public static void main(String[] args){
		Scanner S = new Scanner(System.in);
		
		String inp = "";
		System.out.println("글씨를 입력하면 따라합니다. (종료하려면 Q)");
		while(!(inp.equals("Q"))){
			inp = S.next();
			System.out.println(inp);
		}
	}
}
