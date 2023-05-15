package hamburguer;

public class HamburguerFactory {
    static public Hamburguer[] execute(){
        Hamburguer hamburguer = new HamburguerBuilder().build();
        Hamburguer xEgg = new HamburguerBuilder().setName("XEgg").setEgg(true).setPrice(15.00).build();
        Hamburguer xBurguer = new HamburguerBuilder().setCheese(true).setPrice(20.0).build();
        Hamburguer[] listOfHamburgers = {hamburguer, xEgg, xBurguer};
        return listOfHamburgers;
    }
}
