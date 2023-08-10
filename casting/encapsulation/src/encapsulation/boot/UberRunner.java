package encapsulation.boot;

import encapsulation.app.Uber;

public class UberRunner {
	public static void main(String[] args) {
		Uber myUberRide = new Uber();

		myUberRide.setUserName("Divya");
		myUberRide.setFullName("k.Divya");
		myUberRide.setEmail("Divya@gmail.com");
		myUberRide.setPhoneNumber("+9876786984");
		myUberRide.setPickupLocation("Home");
		myUberRide.setDropLocation("Office");
		myUberRide.setRideType("UberX");
		myUberRide.setDriverName("Anu");
		myUberRide.setRideFare(150.00);
		myUberRide.setDistanceTraveled(10.5);
		myUberRide.setRating(4);
		myUberRide.setRideCompleted(true);
		myUberRide.setPaymentDone(true);

		System.out.println("User Name: " + myUberRide.getUserName());
		System.out.println("Full Name: " + myUberRide.getFullName());
		System.out.println("Email: " + myUberRide.getEmail());
		System.out.println("Phone Number: " + myUberRide.getPhoneNumber());
		System.out.println("Pickup Location: " + myUberRide.getPickupLocation());
		System.out.println("Drop Location: " + myUberRide.getDropLocation());
		System.out.println("Ride Type: " + myUberRide.getRideType());
		System.out.println("Driver Name: " + myUberRide.getDriverName());
		System.out.println("Ride Fare: " + myUberRide.getRideFare());
		System.out.println("Distance Traveled: " + myUberRide.getDistanceTraveled());
		System.out.println("Rating: " + myUberRide.getRating());
		System.out.println("Ride Completed: " + myUberRide.isRideCompleted());
		System.out.println("Payment Done: " + myUberRide.isPaymentDone());
	}

}
