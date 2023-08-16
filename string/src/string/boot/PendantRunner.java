package string.boot;

import string.app.Pendant;

public class PendantRunner {
	public static void main(String[] args) {
		Pendant pendant=new Pendant();
		System.out.println("pendant");
		Pendant pendant2=new Pendant(null, null, 0, 0, null, false, null, null, null, null, 0);
		System.out.println("pendant2");
		Pendant pendant3=new Pendant("100000 rs", "Circle", 50, 50, "latest design", true, "silvar", "Nice", "Gold", "Good look", 50000);
				System.out.println("pendanr3");
	}

}
