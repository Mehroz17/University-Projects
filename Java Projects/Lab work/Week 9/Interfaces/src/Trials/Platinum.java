package Trials;

public class Platinum extends PremiumPackage implements Trials{


    @Override
    public void checkSubscription() {
        System.out.println("Checking Subscription from Platinum :");
    }
}
