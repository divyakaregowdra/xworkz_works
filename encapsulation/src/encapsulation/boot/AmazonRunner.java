package encapsulation.boot;

import encapsulation.app.Amazon;

public class AmazonRunner {


public static void main(String[] args) {
	
	Amazon amazon=new Amazon();
	
	amazon.setEmail(" Divya@gmailemail");
	amazon.setAccountName("4567");
	amazon.setLastLogin("10");
	amazon.setShippingAddress("kottur");
	amazon.setPaymentMethod("online");
	amazon.setAccountBalance("0");
	amazon.setVerified(true);
	amazon.setWishlist("100");
	amazon.setisSub(false);
	
	amazon.setCartItemCount(2);
	amazon.setorderHistory("100");
	amazon.setReview(5);
	amazon.setprimeMemberShip("myself");
	amazon.setisusrfull(true);
	System.out.println("Email:"+amazon.getEmail());
	System.out.println("AccountName:"+amazon.getAccountName());
	System.out.println("LastLogin:"+amazon.getLastLogin());
	System.out.println("ShippingAddress:"+amazon.getShippingAddress());
	System.out.println("paymentMethod:"+amazon.getPaymentMethod());
	System.out.println("AccountBalance:"+amazon.getAccountBalance());
	System.out.println("Verified:"+amazon.isVerified());
	System.out.println("Wishlist:"+amazon.getWishlist());
	System.out.println("isSub:"+amazon.isSub());
	System.out.println("CartItemCount:"+amazon.getCartItemCount());
	System.out.println("orderHistory:"+amazon.getOrderHistory());
	System.out.println("Review:"+amazon.getReview());
	System.out.println("primeMemberShip:"+amazon.getPrimeMemberShip());
	System.out.println("isSub:"+amazon.isSub());


}
}
