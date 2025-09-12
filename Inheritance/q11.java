abstract class Payment {
    
    abstract void processPayment();

    void printReceipt() {
        System.out.println("Printing generic receipt.");
    }
}

class CreditCardPayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing credit card payment.");
    }
}

class PayPalPayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing PayPal payment.");
    }
}

public class q11 {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new PayPalPayment();
        p1.processPayment();
        p1.printReceipt();
        p2.processPayment();
        p2.printReceipt();
    }
}
