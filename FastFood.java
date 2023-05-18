import java.util.Map;

import cashRegister.CashRegisterComposite;
import hamburguer.HamburguerFactory;
import product.Product;

public class FastFood {
    public static void main(String[] args) {
        Map<String, Product> menu = HamburguerFactory.execute();
        CashRegisterComposite cashRegisterComposite = new CashRegisterComposite();

        cashRegisterComposite.add(menu.get("Hamburguer"));
        cashRegisterComposite.add(menu.get("XBurguer"));
        System.out.println(cashRegisterComposite.amount());
    }
}
