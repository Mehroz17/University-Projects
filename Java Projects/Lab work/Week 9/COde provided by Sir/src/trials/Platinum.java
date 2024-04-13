package trials;

public class Platinum extends PremiumPackage implements Trials {

	@Override
	public void checkSubscription() {
		super.checkSubscription();
		System.out.println("Platinum");
	}

	
}
