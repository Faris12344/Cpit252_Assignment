package shopping;

import paymentsStrategy.Payment;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<Product>();

    }

    public void addItem(Product product) {
        this.products.add(product);
    }

    public void removeItem(Product product) {
        this.products.remove(product);
    }

    public double calculateTotal() {
        double sum = 0;
        for (Product product : this.products) {
            sum += product.getPrice();

        }
        return sum;
    }
public void pay(Payment paymentMethod){
double amount = calculateTotal();
paymentMethod.pay(amount);
}
public String toString(){
String message="";
    for (Product product : this.products) {
message += product.toString()+"\n";
        
    }
return message;
}
}
