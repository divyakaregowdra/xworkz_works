package encapsulation.boot;

import encapsulation.app.IRTCT;

public class IRCTCRunner {public static void main(String[] args) {
	IRTCT myIRCTCAccount = new IRTCT();

	myIRCTCAccount.setUserName("Divya");
	myIRCTCAccount.setFullName("k.Divya");
	myIRCTCAccount.setEmail("Divya@gmail.com");
	myIRCTCAccount.setPhoneNumber("+9364748463");
	myIRCTCAccount.setAddress("kottur City");
	myIRCTCAccount.setIdProofType("Aadhar Card");
	myIRCTCAccount.setIdProofNumber("567856789012");
	myIRCTCAccount.setTicketsBooked(10);
	myIRCTCAccount.setCancellationCount(2);
	myIRCTCAccount.setLoyaltyPoints(100);
	myIRCTCAccount.setRegistered(true);
	myIRCTCAccount.setVerified(true);
	myIRCTCAccount.setLastLogin("2023-08-10 15:30");
	myIRCTCAccount.setPreferredLanguage("English");

	System.out.println("User Name: " + myIRCTCAccount.getUserName());
	System.out.println("Full Name: " + myIRCTCAccount.getFullName());
	System.out.println("Email: " + myIRCTCAccount.getEmail());
	System.out.println("Phone Number: " + myIRCTCAccount.getPhoneNumber());
	System.out.println("Address: " + myIRCTCAccount.getAddress());
	System.out.println("ID Proof Type: " + myIRCTCAccount.getIdProofType());
	System.out.println("ID Proof Number: " + myIRCTCAccount.getIdProofNumber());
	System.out.println("Tickets Booked: " + myIRCTCAccount.getTicketsBooked());
	System.out.println("Cancellation Count: " + myIRCTCAccount.getCancellationCount());
	System.out.println("Loyalty Points: " + myIRCTCAccount.getLoyaltyPoints());
	System.out.println("Registered: " + myIRCTCAccount.isRegistered());
	System.out.println("Verified: " + myIRCTCAccount.isVerified());
	System.out.println("Last Login: " + myIRCTCAccount.getLastLogin());
	System.out.println("Preferred Language: " + myIRCTCAccount.getPreferredLanguage());
}

}
