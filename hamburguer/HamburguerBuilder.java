package hamburguer;

public class HamburguerBuilder {

    private String name = "Hamburguer";
    private Double price = 0.00;
    private int quantityMeat = 1;
    private boolean salad = true;
    private boolean cheese = false;
    private boolean egg = false;

    public HamburguerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public HamburguerBuilder setPrice(Double price) {
        this.price = price;
        return this;
    }

    public HamburguerBuilder setQuantityMeat(int quantityMeat) {
        this.quantityMeat = quantityMeat;
        return this;
    }

    public HamburguerBuilder setSalad(boolean salad) {
        this.salad = salad;
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

    public Hamburguer build() {
        return new Hamburguer(name, price, quantityMeat, salad, cheese, egg);
    }

}
