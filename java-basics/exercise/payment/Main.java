package payment;

public class Main {
    public static void main(String[] args) {
        Payment p1 = new Alipay();
        Payment p2 = new WechatPay();

        p1.pay(200);
        p2.pay(300);
    }
}
