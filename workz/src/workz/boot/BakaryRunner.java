package workz.boot;

import workz.app.Bakaey;
import workz.app.WarriorBakary;

public class BakaryRunner {

		public static void main(String[] args) {
			System.out.println("Running Main...........");

			Bakaey bakery = new Bakaey();// printing overloading methods in parent class

			bakery.bake();
			bakery.bake(499.0);
			bakery.bake(10);
			bakery.bake("Sweet");
			bakery.bake("Cake", 49);
			bakery.bake("Juice", 10, 200);

			System.out.println("------------------------------");

			Bakaey bakery2 = new WarriorBakary(); // Achive override through parent class ref

			bakery2.bake();
			bakery2.bake(699.0);
			bakery2.bake(9);
			bakery2.bake("Peda");
			bakery2.bake("Badam Sweet", 50);
			bakery2.bake("Juice", 20, 900);

			System.out.println("------------------------------");// Achive override through Child class ref

			WarriorBakary bakery3 = new WarriorBakary();

			bakery3.bake();
			bakery3.bake(899.0);
			bakery3.bake(5);
			bakery3.bake("Buiscuits");
			bakery3.bake("Cake", 49);
			bakery3.bake("Juice", 20, 700);

		}
}
