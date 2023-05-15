import hamburguer.Hamburguer;
import hamburguer.HamburguerFactory;

public class FastFood {
    public static void main(String[] args) {
        Hamburguer[] menu = FriesFactory.execute();    
        System.out.println(menu[1].name);
    }
}
