public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Checkout with Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100);

        // Checkout with PayPal
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(50);
    }

}