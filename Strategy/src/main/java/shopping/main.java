package shopping;

import java.util.Scanner;
import shopping.ShoppingCart;
import shopping.Product;
import paymentsStrategy.*;

public class main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product item1 = new Product("Body wash", "549032", 10.99);
        Product item2 = new Product("Shampoo", "872150", 14.99);
        cart.addItem(item1);
        cart.addItem(item2);
        System.out.println("Shopping cart:\n" + cart.toString());
        System.out.println("Your total is: $" + cart.calculateTotal());
        System.out.println("\nPlease select your payment method:\n"
                + "1. Credit card\n2. PayPal\n");
        Scanner scanner = new Scanner(System.in);
        int paymentMethod = scanner.nextInt();
        if (paymentMethod == 1) {
            cart.pay(new CreditCardPayment("Ali Omar", "4111111111111111", "123", "12/23"));

        } else if (paymentMethod == 2) {

            cart.pay(new PayPalPayment("email@example.com", "my-merchant-ID"));
        }
    }

}
