import java.io.*;

public class KeyboardTest{
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		// InputStream 객체에 콘솔입력을 전달
		BufferedReader in = new BufferedReader(isr);
		// BufferReader에 InputStream을 연결

		String str="";
		while(!(str.equalsIgnoreCase("q"))){
			System.out.println("글씨를 입력하면 따라합니다. (종료하려면 Q)");
			str=in.readLine();
			System.out.println(str);
		}
	}
}
