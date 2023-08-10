package encapsulation.boot;

import encapsulation.app.Cred;

public class CredRunner {
	public static void main(String[] args) {
		Cred myCredAccount = new Cred();

		myCredAccount.setUserName("Divya");
		myCredAccount.setFullName("k.Divya");
		myCredAccount.setEmail("k.Divya@gmail");
		myCredAccount.setPhoneNumber("8088230286");
		myCredAccount.setAddress(" Rajajinagar");
		myCredAccount.setCreditCardNumber("5678-3456");
		myCredAccount.setCardExpirationDate("12/26");
		myCredAccount.setCardHolderName("Divya");
		myCredAccount.setBillingAddress("Bengalore");
		myCredAccount.setRewardsPoints(600);
		myCredAccount.setCreditLimit(1000.00);
		myCredAccount.setPremium(true);
		myCredAccount.setVerified(true);

		System.out.println("User Name: " + myCredAccount.getUserName());
		System.out.println("Full Name: " + myCredAccount.getFullName());
		System.out.println("Email: " + myCredAccount.getEmail());
		System.out.println("Phone Number: " + myCredAccount.getPhoneNumber());
		System.out.println("Address: " + myCredAccount.getAddress());
		System.out.println("Credit Card Number: " + myCredAccount.getCreditCardNumber());
		System.out.println("Card Expiration Date: " + myCredAccount.getCardExpirationDate());
		System.out.println("Card Holder Name: " + myCredAccount.getCardHolderName());
		System.out.println("Billing Address: " + myCredAccount.getBillingAddress());
		System.out.println("Rewards Points: " + myCredAccount.getRewardsPoints());
		System.out.println("Credit Limit: " + myCredAccount.getCreditLimit());
		System.out.println("Premium: " + myCredAccount.isPremium());
		System.out.println("Verified: " + myCredAccount.isVerified());
	}


}
