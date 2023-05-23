package order;

import java.util.List;

import product.IProduct;

public class OrderObserver implements IOrderObserver {
    private String name;

    public OrderObserver(String name) {
        this.name = name;
    }

    @Override
    public void execute(List<IProduct> products) {
        String lines = "-.-.-.-.-.-.-.-.-.-.-.-";
        System.out.println(lines);
        System.out.println("Pedido: " + this.name);
        for (IProduct product : products) {
            System.out.println(product.getName());
        }
        System.out.println(lines);
    }

}
