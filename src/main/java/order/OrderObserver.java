package order;

import java.util.List;

import Product.IProduct;

public class OrderObserver implements IOrderObserver {
    private final String name;

    public OrderObserver(String name) {
        this.name = name;
    }

    @Override
    public String execute(List<IProduct> products) {
        String order = createOutput(products);
        System.out.println(order);
        return order;
    }

    public String createOutput(List<IProduct> products){
        StringBuilder output = new StringBuilder();
        String lines = "-.-.-.-.-.-.-.-.-.-.-.-";

        output.append(lines).append("\n");
        output.append("Pedido: ").append(this.name).append("\n");
        for (IProduct product : products) {
            output.append(product.getName()).append("\n");
        }
        output.append(lines);

        return output.toString();
    }

}
