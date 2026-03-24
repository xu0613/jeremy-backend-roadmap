package payment;

public class WechatPay implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment " + amount + " by WechatPay.");
    }
}
