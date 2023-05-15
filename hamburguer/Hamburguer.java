package hamburguer;

public class Hamburguer {
    public String name;
    public double price;
    public int quantityMeat;
    public boolean salad;
    public boolean cheese;
    public boolean egg;

    public Hamburguer(String name, Double price, int quantityMeat, boolean salad, boolean cheese,  boolean egg) {
        this.name = name;
        this.price = price;
        this.quantityMeat = quantityMeat;
        this.salad = salad;
        this.cheese = cheese;
        this.egg = egg;
    }
}