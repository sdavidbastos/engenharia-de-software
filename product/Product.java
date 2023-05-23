package product;

public abstract class Product implements IProduct {
    public String name;
    public double price;

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
