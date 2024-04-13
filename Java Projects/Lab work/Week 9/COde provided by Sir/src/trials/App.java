package trials;

public class App {

	public static void main(String[] args) {
		
		Subscription subscription = new Subscription();
		PremiumPackage pp = new PremiumPackage();
		HomePackage hp = new HomePackage();
		PremiumPackage p = new Platinum();
		
		
		subscription.printSubscriptionDetials(pp);
		subscription.printSubscriptionDetials(hp);
		subscription.printSubscriptionDetials(p);
		
	}
}
