package paymentsStrategy;

public class CreditCardPayment implements Payment {

    private String name;
    private String cardNumber;
    private String cvv;
    private String monthYearExpiration;

    public CreditCardPayment(String name, String cardNumber, String cvv, String monthYearExpiration) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.monthYearExpiration = monthYearExpiration;
    }
public void pay(double amount){
    System.out.println(amount+" paid with credit card");
}
}
