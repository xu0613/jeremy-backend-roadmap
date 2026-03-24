package payment;

public class Alipay implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by Alipay.");
    }
}
