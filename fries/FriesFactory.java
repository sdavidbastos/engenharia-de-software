package fries;

public class FriesFactory {
    static public Fries[] execute() {
        Fries fries = new FriesBuilder()
                .build();

        Fries fiesWithCheddar = new FriesBuilder()
                .setName("Batata Frita com Cheddar")
                .setCheese(true)
                .setPrice(15)
                .build();

        Fries fiesWithCheddarAndBacon = new FriesBuilder()
                .setName("Batata Frita com Cheddar e Bacon")
                .setCheese(true)
                .setPrice(20).build();

        Fries[] listOfFries = { fries, fiesWithCheddar, fiesWithCheddarAndBacon };

        return listOfFries;
    }
}
