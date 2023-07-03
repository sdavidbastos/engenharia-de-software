package order;

import java.util.List;

import Product.IProduct;

public interface IOrderSubject {

    void subscribe(IOrderObserver observer);

    void unSubscribe(IOrderObserver observer);

    void notifySubscribes(List<IProduct> products);
}
