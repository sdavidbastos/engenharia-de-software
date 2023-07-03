package Patterns;

import hamburguer.Hamburguer;
import hamburguer.HamburguerBuilder;
import hamburguer.HamburguerEnum;
import hamburguer.HamburguerFactory;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CreationalPatternsTest {

    @Test
    void builder(){
        Hamburguer hamburguerExpected = new Hamburguer(String.valueOf(HamburguerEnum.HAMBURGUER), 10, 1, true, false, false);
        Hamburguer hamburgerBuilder = new HamburguerBuilder().setPrice(10).setCheese(true).build();

        assertEquals(hamburguerExpected.getName(), hamburgerBuilder.getName());
        assertEquals(hamburguerExpected.getPrice(), hamburgerBuilder.getPrice());
        assertEquals(hamburguerExpected.cheese, hamburgerBuilder.cheese);
        assertEquals(hamburguerExpected.egg, hamburgerBuilder.egg);
        assertEquals(hamburguerExpected.bacon, hamburgerBuilder.bacon);
    }

    @Test
    void factory(){
        Map<String, Hamburguer> menu = HamburguerFactory.execute();
        String[] hambugersNamesMenu = menu.keySet().toArray(new String[0]);
        String[] hambugersNamesMenuExpected = {"XBACON", "XBURGUER", "XEGG", "HAMBURGUER"};

        assertEquals(hambugersNamesMenuExpected[0], hambugersNamesMenu[0]);
        assertArrayEquals(hambugersNamesMenuExpected, hambugersNamesMenu);
        assertEquals(4, hambugersNamesMenu.length);
    }
}