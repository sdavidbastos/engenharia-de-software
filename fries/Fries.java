package fries;

import product.Product;

public class Fries extends Product {
    public boolean bacon;
    public boolean cheese;
    public String length;

    public Fries(String name, double price, boolean bacon, boolean cheese, String length) {
        this.name = name;
        this.price = price;
        this.bacon = bacon;
        this.cheese = cheese;
        this.length = length;

    }
}