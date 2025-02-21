
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.junit.MockitoJUnit.*;
import org.mockito.exceptions.base.MockitoException;
import classes.Beer;
import classes.Brewery;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

public class BeerAppTestModule {

    @Test
    public void testBeer(){
        Beer balt9 = new Beer();
        balt9.setName("Балтика 9");
        balt9.setAlcoStrength(5.6f);
        balt9.setType("Lager");

        assertEquals("Балтика 9",balt9.getName());
        assertEquals("Lager", balt9.getType());
        assertEquals(5.6f,balt9.getAlcoStrength());
    }


    @Test
    public void testBrewery(){
        Brewery konix = new Brewery();

        ArrayList<Beer> beers = new ArrayList<>();
        konix.setAddress("Лиговский проспект 129");
        konix.setName("ООО Коникс");

        assertEquals("ООО Коникс",konix.getName());
        assertEquals("Лиговский проспект 129", konix.getAddress());

    }
}
