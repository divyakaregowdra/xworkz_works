package encapsulation.boot;

import encapsulation.app.WhatsApp;

public class WhatsAppERunner {
	public static void main(String[] args) {
        WhatsApp myWhatsApp = new WhatsApp();

        myWhatsApp.setUserName("Divya");
        myWhatsApp.setPhoneNumber("8088345678");
        myWhatsApp.setProfilePicture("profile.jpg");
        myWhatsApp.setStatus("Hello, every one");
        myWhatsApp.setLastSeen("2023-08-10 15:30");
        myWhatsApp.setMessageNotifications(true);
        myWhatsApp.setGroupNotifications(true);
        myWhatsApp.setDarkMode(false);
        myWhatsApp.setMediaShared(50);
        myWhatsApp.setTotalContacts(150);
        myWhatsApp.setBlockedContacts(10);
        myWhatsApp.setFavoriteContacts(5);
        myWhatsApp.setChatHistory("No Chart History");
        myWhatsApp.setUnreadMessages(10);

        System.out.println("User Name: " + myWhatsApp.getUserName());
        System.out.println("Phone Number: " + myWhatsApp.getPhoneNumber());
        System.out.println("Profile Picture: " + myWhatsApp.getProfilePicture());
        System.out.println("Status: " + myWhatsApp.getStatus());
        System.out.println("Last Seen: " + myWhatsApp.getLastSeen());
        System.out.println("Message Notifications: " + myWhatsApp.isMessageNotifications());
        System.out.println("Group Notifications: " + myWhatsApp.isGroupNotifications());
        System.out.println("Dark Mode: " + myWhatsApp.isDarkMode());
        System.out.println("Media Shared: " + myWhatsApp.getMediaShared());
        System.out.println("Total Contacts: " + myWhatsApp.getTotalContacts());
        System.out.println("Blocked Contacts: " + myWhatsApp.getBlockedContacts());
        System.out.println("Favorite Contacts: " + myWhatsApp.getFavoriteContacts());
        System.out.println("Chat History: " + myWhatsApp.getChatHistory());
        System.out.println("Unread Messages: " + myWhatsApp.getUnreadMessages());
    }

}
