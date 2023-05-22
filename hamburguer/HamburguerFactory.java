package hamburguer;

import java.util.HashMap;
import java.util.Map;

import product.Product;

public class HamburguerFactory {

    static public Map<String, Product> execute() {
        Map<String, Product> burguers = new HashMap<>();

        Hamburguer hamburguer = new HamburguerBuilder()
                .setPrice(10.0)
                .build();

        Hamburguer xEgg = new HamburguerBuilder()
                .setName("" + HamburguerEnum.XEGG)
                .setEgg(true)
                .setPrice(15.0)
                .build();

        Hamburguer xBurguer = new HamburguerBuilder()
                .setName(""+HamburguerEnum.XBURGUER)
                .setCheese(true)
                .setPrice(20.0)
                .build();

        Hamburguer xBacon = new HamburguerBuilder()
                .setName(""+HamburguerEnum.XBACON)
                .setCheese(true)
                .setPrice(20.0)
                .build();

        Hamburguer[] listOfHamburgers = { hamburguer, xEgg, xBurguer, xBacon };

        for (Hamburguer burguer : listOfHamburgers) {
            burguers.put(burguer.name, burguer);
        }
        return burguers;
    }
}
