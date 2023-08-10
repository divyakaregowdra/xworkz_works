package encapsulation.boot;

import encapsulation.app.YouTube;

public class YouTubeRunner {
	public static void main(String[] args) {
		YouTube myYouTubeChannel = new YouTube();

		myYouTubeChannel.setChannelName("BhuvanGouda YouTube Channal");
		myYouTubeChannel.setOwnerName("Bhuvi");
		myYouTubeChannel.setDescription("All type");
		myYouTubeChannel.setEmail("Bhuvan@gmail.com");
		myYouTubeChannel.setCountry("India");
		myYouTubeChannel.setProfilePicture("profile.jpg");
		myYouTubeChannel.setSubscribersCount(50000);
		myYouTubeChannel.setVideosCount(100);
		myYouTubeChannel.setViewsCount(1000000);
		myYouTubeChannel.setLikesCount(50000);
		myYouTubeChannel.setVerified(true);
		myYouTubeChannel.setMonetized(true);
		myYouTubeChannel.setJoinDate("2020-01-01");
		myYouTubeChannel.setLastActivity("2023-08-10");

		System.out.println("Channel Name: " + myYouTubeChannel.getChannelName());
		System.out.println("Owner Name: " + myYouTubeChannel.getOwnerName());
		System.out.println("Description: " + myYouTubeChannel.getDescription());
		System.out.println("Email: " + myYouTubeChannel.getEmail());
		System.out.println("Country: " + myYouTubeChannel.getCountry());
		System.out.println("Profile Picture: " + myYouTubeChannel.getProfilePicture());
		System.out.println("Subscribers Count: " + myYouTubeChannel.getSubscribersCount());
		System.out.println("Videos Count: " + myYouTubeChannel.getVideosCount());
		System.out.println("Views Count: " + myYouTubeChannel.getViewsCount());
		System.out.println("Likes Count: " + myYouTubeChannel.getLikesCount());
		System.out.println("Verified: " + myYouTubeChannel.isVerified());
		System.out.println("Monetized: " + myYouTubeChannel.isMonetized());
		System.out.println("Join Date: " + myYouTubeChannel.getJoinDate());
		System.out.println("Last Activity: " + myYouTubeChannel.getLastActivity());
	}

}
