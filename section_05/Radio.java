class RadioOption{
	static String color = "white";
	int volume = 5;
	boolean power = false;
}

public class Radio{
	static int x = 10;

	public static void main(String[] args){
		System.out.println(RadioOption.color);
		//System.out.println(RadioOption.volume);
		
		RadioOption ro = new RadioOption();
		ro.power = true;
		System.out.println(ro.power);

		//int x = 100;

		System.out.println(x);
	}
}
