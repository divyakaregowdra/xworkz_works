package association.boot;

import association.app.Garage;

public class GarageRunner {
	

		public static void main(String[] args) {
			
			System.out.println("Invoking main in GarageRunner");
			Garage garage= new Garage();
			garage.repair();
			garage.wash();
		}

}