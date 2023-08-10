package encapsulation.app;

public class Amazon {
private String email;
private String accountName;
private String lastLogin;
private String ShippingAddress;
private String paymentMethod;
private String accountBalance;
private boolean isVerified;
private String wishlist;
private boolean isSub;
private int cartItemCount;
private String orderHistory;
private int review;
private String primeMemberShip;
private boolean isusefull;

public String getPrimeMemberShip()
{
	return primeMemberShip;
}
public void setprimeMemberShip(String primeMemberShip) {
	this.primeMemberShip=primeMemberShip;
}
public boolean isusefull()
{
	return isusefull;
}
public void setisusrfull(boolean usefull)
{
	isusefull=usefull;
}
public String getEmail()
{
return email;

}
public void setEmail(String email)
{
	this.email=email;
}

public String getWishlist()
{
return wishlist;

}
public void setWishlist(String wishlist)
{
	this.wishlist=wishlist;
}
public boolean isVerified()
{
	return isVerified;
}
public void setVerified(boolean verified)
{
	isVerified=verified;
}
public boolean isSub()
{
	return isSub;
}
public void setisSub(boolean sub)
{
	isSub=sub;
}


public String getAccountName()
{
	return accountName;
	
}

public void setAccountName(String accountName)
{
	this.accountName=accountName;
}
public String getLastLogin()
{
	return lastLogin;
}
public void setLastLogin(String lastLogin)
{
	this.lastLogin=lastLogin;
}
public String  getShippingAddress()
{
	return ShippingAddress;
}
public void setShippingAddress(String ShippingAddress)
{
	this.ShippingAddress=ShippingAddress;
}
public String getPaymentMethod()
{
	return paymentMethod;
}
public void setPaymentMethod(String paymentMethod)
{
	this.paymentMethod=paymentMethod;
}
public String getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(String accountBalance)
{
	this.accountBalance=accountBalance;
}
public int getCartItemCount()
{
	return cartItemCount;
}
public void setCartItemCount(int cartItemCount)
{
	this.cartItemCount=cartItemCount;
}
public String getOrderHistory()
{
	return orderHistory;
}
public void setorderHistory(String orderHistory)
{
	this. orderHistory=orderHistory;
}
public int getReview()
{
	return review;
}
public void setReview(int review)
{
	this.review=review;
}

}