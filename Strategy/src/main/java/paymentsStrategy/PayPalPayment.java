
package paymentsStrategy;


public class PayPalPayment implements Payment{
private String email;
private String url;

    public PayPalPayment(String email, String url) {
        this.email = email;
        this.url = url;
    }


public void pay(double amount){
    System.out.println(amount+" paid using Paypal");
}
    
}
