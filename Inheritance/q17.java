interface Payment {
    void process(double amount);
}

abstract class OnlinePayment implements Payment {
    @Override
    public void process(double amount) {
        System.out.println("Processing online payment of " + amount);
    }
    abstract void authenticate();
}

class CreditCardPayment extends OnlinePayment {
    @Override
    void authenticate() {
        System.out.println("Authenticating credit card payment.");
    }
}

class PayPalPayment extends OnlinePayment {
    @Override
    void authenticate() {
        System.out.println("Authenticating PayPal payment.");
    }
}

public class q17 {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new PayPalPayment();
        p1.process(100);
        ((CreditCardPayment)p1).authenticate();
        p2.process(200);
        ((PayPalPayment)p2).authenticate();
    }
}

