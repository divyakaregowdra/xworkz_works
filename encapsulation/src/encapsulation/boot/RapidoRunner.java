package encapsulation.boot;

import encapsulation.app.Rapido;

public class RapidoRunner {
	public static void main(String[] args) {
		Rapido myRapidoRide = new Rapido();

		myRapidoRide.setUserName("Divya");
		myRapidoRide.setFullName("k.divya");
		myRapidoRide.setEmail("Divya@gmail.com");
		myRapidoRide.setPhoneNumber("87945678");
		myRapidoRide.setPickupLocation("Home");
		myRapidoRide.setDropLocation("Office");
		myRapidoRide.setRideType("car");
		myRapidoRide.setDriverName("Anu");
		myRapidoRide.setRideFare(50.00);
		myRapidoRide.setDistanceTraveled(5.0);
		myRapidoRide.setRating(4);
		myRapidoRide.setRideCompleted(true);
		myRapidoRide.setPaymentDone(true);

		System.out.println("User Name: " + myRapidoRide.getUserName());
		System.out.println("Full Name: " + myRapidoRide.getFullName());
		System.out.println("Email: " + myRapidoRide.getEmail());
		System.out.println("Phone Number: " + myRapidoRide.getPhoneNumber());
		System.out.println("Pickup Location: " + myRapidoRide.getPickupLocation());
		System.out.println("Drop Location: " + myRapidoRide.getDropLocation());
		System.out.println("Ride Type: " + myRapidoRide.getRideType());
		System.out.println("Driver Name: " + myRapidoRide.getDriverName());
		System.out.println("Ride Fare: " + myRapidoRide.getRideFare());
		System.out.println("Distance Traveled: " + myRapidoRide.getDistanceTraveled());
		System.out.println("Rating: " + myRapidoRide.getRating());
		System.out.println("Ride Completed: " + myRapidoRide.isRideCompleted());
		System.out.println("Payment Done: " + myRapidoRide.isPaymentDone());
	}

}
