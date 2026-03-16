package POLYMORPHISM;

class Payment {
    void processPayment() {
        System.out.println("Processing payment through:");
    }
    public static void main(String[] args) {
        Payment p;
        p = new CreditCard();
        p.processPayment();
        p = new DebitCard();
        p.processPayment();
        p = new PayPal();
        p.processPayment();
    }
}
class CreditCard extends Payment {
    void processPayment() {
        super.processPayment();
        System.out.println("Credit Card");
    }
}
class DebitCard extends Payment {
    void processPayment() {
        super.processPayment();
        System.out.println("Debit Card");
    }
}
class PayPal extends Payment {
    void processPayment() {
        super.processPayment();
        System.out.println("PayPal");
    }
}
