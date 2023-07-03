package Patterns;

import Product.IProduct;
import discount.DiscountStrategy;
import discount.IDiscountStrategy;
import hamburguer.HamburguerBuilder;
import order.IOrderObserver;
import order.IOrderSubject;
import order.OrderObserver;
import order.OrderSubject;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BehavioralPatternsTest {

    @Test
    void observer(){
        List<IProduct> mockProducts = new ArrayList<>();
        mockProducts.add(new HamburguerBuilder().build());
        mockProducts.add(new HamburguerBuilder().build());

        IOrderSubject eventManagerScreen = new OrderSubject();
        IOrderObserver kitchenScreen = new OrderObserver("Cozinha");
        eventManagerScreen.subscribe(kitchenScreen);
        String expected = "-.-.-.-.-.-.-.-.-.-.-.-\nPedido: Cozinha\nHAMBURGUER\nHAMBURGUER\n-.-.-.-.-.-.-.-.-.-.-.-";

        assertEquals(expected, kitchenScreen.execute(mockProducts));
    }

    @Test
    void strategy(){
        IDiscountStrategy strategy = new DiscountStrategy();

        assertEquals(.9, strategy.execute(2));
        assertEquals(1, strategy.execute(1));
    }
}