package Patterns;

import Product.IProduct;
import additional.Additional;
import cashregister.CashRegisterComposite;
import discount.DiscountStrategy;
import discount.IDiscountStrategy;
import hamburguer.HamburguerBuilder;
import order.IOrderSubject;
import order.OrderSubject;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StructuralPatternsTest {

    @Test
    void composite() {
        IOrderSubject mockEventManagerScreen = Mockito.mock(OrderSubject.class);
        Mockito.doNothing().when(mockEventManagerScreen).notifySubscribes(new ArrayList<>());

        IDiscountStrategy mockDiscountStrategy = Mockito.mock(DiscountStrategy.class);
        Mockito.when(mockDiscountStrategy.execute(Mockito.anyInt())).thenReturn(0.8);

        CashRegisterComposite cashRegisterComposite = new CashRegisterComposite(mockDiscountStrategy, mockEventManagerScreen);
        cashRegisterComposite.add(new HamburguerBuilder().setPrice(10).build());
        cashRegisterComposite.add(new HamburguerBuilder().setPrice(20).build());

        assertEquals(24, cashRegisterComposite.amount());
        assertEquals(2, cashRegisterComposite.products.size());
    }

    @Test
    void decorator() {
        IProduct hamburguer = new HamburguerBuilder().build();
        IProduct hamburguerWithoutSalad = new Additional(new Additional(new Additional(hamburguer, ", Sem Tomate"), ", Sem Cebola"), ", Bacon Extra", 5);
        assertEquals("HAMBURGUER, Sem Tomate, Sem Cebola, Bacon Extra", hamburguerWithoutSalad.getName());
        assertEquals(15, hamburguerWithoutSalad.getPrice());
    }
}