package shopping;

public class Product {

    private String sku;
    private String name;
    private double price;

    public Product(String sku, String name, double price) {
        this.sku = sku;
        this.name = name;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return this.name + "\t" + "SKU" + this.sku + "\t price: $" + this.price;
    }

}
