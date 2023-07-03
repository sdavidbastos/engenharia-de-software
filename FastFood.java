import java.util.Map;

import additional.Additional;
import cashregister.CashRegisterComposite;
import discount.BlackFridayStrategy;
import discount.DiscountStrategy;
import hamburguer.HamburguerEnum;
import hamburguer.HamburguerFactory;
import order.IOrderObserver;
import order.IOrderSubject;
import order.OrderObserver;
import order.OrderSubject;
import Patterns.IProduct;
import Patterns.Product;

public class FastFood {
    public static void main(String[] args) {
        Map<String, Product> menu = HamburguerFactory.execute();
        
        IOrderSubject eventManagerScreen = new OrderSubject();
        
        CashRegisterComposite cashRegisterComposite = new CashRegisterComposite(new DiscountStrategy(), eventManagerScreen);
        CashRegisterComposite cashRegisterCompositeBlackFriday = new CashRegisterComposite(new BlackFridayStrategy(), eventManagerScreen);

        IProduct hamburguer = menu.get("" + HamburguerEnum.HAMBURGUER);
        IProduct xBacon = menu.get("" + HamburguerEnum.XBACON);
        IProduct hamburguerWithoutSalad = new Additional(new Additional(new Additional(xBacon, ", Sem Tomate"), ", Sem Cebola"), ", Bacon Extra", 5);
        
        IOrderObserver roomScreen = new OrderObserver("Sala");
        IOrderObserver kitchenScreen = new OrderObserver("Cozinha");

        cashRegisterComposite.add(hamburguer);
        cashRegisterComposite.add(hamburguerWithoutSalad);

        cashRegisterCompositeBlackFriday.add(hamburguer);
        cashRegisterCompositeBlackFriday.add(hamburguer);
        cashRegisterCompositeBlackFriday.add(xBacon);
        cashRegisterCompositeBlackFriday.add(xBacon);

        eventManagerScreen.subscribe(kitchenScreen); 
        eventManagerScreen.subscribe(roomScreen);

        System.out.println(cashRegisterComposite.produceProduct());
    }
}
