package string.boot;

import string.app.Logo;

public class LogoRunner {
	

	public static void main(String[] args) {
		System.out.println("Running in main in logo");
		Logo logo=new Logo();
		System.out.println("logo");
		Logo logo2=new Logo(null, null, null, 450, false);
		System.out.println("logo2");
		Logo logo3=new Logo("silver", "white", "circle", 2023, true);

	}

}
