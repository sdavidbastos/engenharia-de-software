package hamburguer;

public class HamburguerBuilder {

    private String name = String.valueOf(HamburguerEnum.HAMBURGUER);
    private double price = 10;
    private int quantityMeat = 1;
    private boolean cheese = false;
    private boolean egg = false;
    private boolean bacon = false;

    public HamburguerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public HamburguerBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public HamburguerBuilder setQuantityMeat(int quantityMeat) {
        this.quantityMeat = quantityMeat;
        return this;
    }

    public HamburguerBuilder setCheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }

    public HamburguerBuilder setEgg(boolean egg) {
        this.egg = egg;
        return this;
    }

    public HamburguerBuilder setBacon(boolean bacon) {
        this.bacon = bacon;
        return this;
    }

    public Hamburguer build() {
        return new Hamburguer(name, price, quantityMeat, cheese, egg, bacon);
    }

}
