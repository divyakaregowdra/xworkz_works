package string.boot;

import string.app.Cave;

public class CaveRunner {
	public static void main(String[] args) {
		Cave cave=new Cave();
		System.out.println("cave");
		Cave cave2=new Cave(null, null, 0, null, 0, 0, null, 0, 0, null);
	System.out.println("cave2");
	Cave cave3=new Cave("Karnataka","Ajantha",50,"cement",50,50,"Triangle",10,2,"Middle");
	System.out.println("cave3");
	}

}
