package fries;

public class FriesBuilder {

    private String name = "Batata Frita";
    private String length = "P";
    private double price = 0;
    private boolean cheese = false;
    private boolean bacon = false;

    public FriesBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public FriesBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public FriesBuilder setCheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }

    public FriesBuilder setBacon(boolean bacon) {
        this.bacon = bacon;
        return this;
    }
    public FriesBuilder setLength(String length) {
        this.length = length;
        return this;
    }

    public Fries build() {
        return new Fries(name, price, cheese, bacon, length);
    }

}
