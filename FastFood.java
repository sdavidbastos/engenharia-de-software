import java.util.Map;

import cashRegister.CashRegisterComposite;
import discount.BlackFridayStrategy;
import discount.DiscountStrategy;
import hamburguer.HamburguerEnum;
import hamburguer.HamburguerFactory;
import ingredients.IIngredientDecorator;
import ingredients.IngredientAdapter;
import ingredients.WithoutOnionDecorator;
import ingredients.WithoutTomatoDecorator;
import product.Product;

public class FastFood {
    public static void main(String[] args) {
        Map<String, Product> menu = HamburguerFactory.execute();
        CashRegisterComposite cashRegisterComposite = new CashRegisterComposite(new DiscountStrategy());
        CashRegisterComposite cashRegisterCompositeBlackFriday = new CashRegisterComposite(new BlackFridayStrategy());

        Product hamburguer = menu.get("" + HamburguerEnum.HAMBURGUER);
        Product xBacon = menu.get("" + HamburguerEnum.XBACON);

        IIngredientDecorator hamburguerDescription = new WithoutTomatoDecorator(
                new WithoutOnionDecorator(new IngredientAdapter(hamburguer)));

        cashRegisterComposite.add(hamburguer);
        cashRegisterComposite.add(xBacon);

        cashRegisterCompositeBlackFriday.add(hamburguer);
        cashRegisterCompositeBlackFriday.add(hamburguer);
        cashRegisterCompositeBlackFriday.add(xBacon);
        cashRegisterCompositeBlackFriday.add(xBacon);
        
        System.out.println(cashRegisterComposite.total);
        System.out.println(cashRegisterComposite.amount());
        
        System.out.println(cashRegisterCompositeBlackFriday.total);
        System.out.println(cashRegisterCompositeBlackFriday.amount());
    }
}
