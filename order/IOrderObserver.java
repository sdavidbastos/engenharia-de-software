package order;

import java.util.List;

import product.IProduct;

public interface IOrderObserver {
    void execute(List<IProduct> products);
}