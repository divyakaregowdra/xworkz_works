package string.boot;

import string.app.Flag;

public class FlagRunner {
public static void main(String[] args) {
	System.out.println("invoking main in flag");
	Flag flag=new Flag();
	System.out.println("flag");
	Flag flag2=new Flag(null, 0, null);
	System.out.println("flag2");
	Flag flag3=new Flag("India",3,"50");
	System.out.println("flag3");
}
}
