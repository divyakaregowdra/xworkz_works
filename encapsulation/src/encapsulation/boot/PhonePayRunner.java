package encapsulation.boot;

import encapsulation.app.PhonePay;

public class PhonePayRunner {
	public static void main(String[] args) {
		PhonePay myPhonePay = new PhonePay();

		myPhonePay.setUserName("Divya");
		myPhonePay.setPhoneNumber("73649058");
		myPhonePay.setEmail("Divya@gmail.com");
		myPhonePay.setProfilePicture("profile.jpg");
		myPhonePay.setLinkedBankAccount("456756789012");
		myPhonePay.setAddress(" Bengalore");
		myPhonePay.setWalletBalance(500.50);
		myPhonePay.setTransactionsCount(50);
		myPhonePay.setRewardsPoints(100);
		myPhonePay.setKYCVerified(true);
		myPhonePay.setUPIEnabled(true);
		myPhonePay.setLastLogin("2023-08-10 15:30");
		myPhonePay.setPreferredLanguage("English");
		myPhonePay.setAppVersion("2.1.0");

		System.out.println("User Name: " + myPhonePay.getUserName());
		System.out.println("Phone Number: " + myPhonePay.getPhoneNumber());
		System.out.println("Email: " + myPhonePay.getEmail());
		System.out.println("Profile Picture: " + myPhonePay.getProfilePicture());
		System.out.println("Linked Bank Account: " + myPhonePay.getLinkedBankAccount());
		System.out.println("Address: " + myPhonePay.getAddress());
		System.out.println("Wallet Balance: " + myPhonePay.getWalletBalance());
		System.out.println("Transactions Count: " + myPhonePay.getTransactionsCount());
		System.out.println("Rewards Points: " + myPhonePay.getRewardsPoints());
		System.out.println("KYC Verified: " + myPhonePay.isKYCVerified());
		System.out.println("UPI Enabled: " + myPhonePay.isUPIEnabled());
		System.out.println("Last Login: " + myPhonePay.getLastLogin());
		System.out.println("Preferred Language: " + myPhonePay.getPreferredLanguage());
		System.out.println("App Version: " + myPhonePay.getAppVersion());
	}

}
