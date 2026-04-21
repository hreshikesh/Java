public class PaymentApp {

    // Interface
    interface Payment {
        void pay(double amount);
    }

    // UPI Implementation
    static class UpiPayment implements Payment {
        private String upiId;

        public UpiPayment(String upiId) {
            this.upiId = upiId;
        }

        public void pay(double amount) {
            System.out.println("Paid ₹" + amount + " using UPI ID: " + upiId);
        }
    }

    // Credit Card Implementation
    static class CreditCardPayment implements Payment {
        private String cardNumber;

        public CreditCardPayment(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public void pay(double amount) {
            System.out.println("Paid ₹" + amount + " using Credit Card: " + cardNumber);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Payment p1 = new UpiPayment("rishi@upi");
        p1.pay(500);

        Payment p2 = new CreditCardPayment("1234-5678-9012-3456");
        p2.pay(1500);
    }
}
