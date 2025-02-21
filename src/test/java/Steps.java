import classes.Beer;
import classes.Brewery;
import io.cucumber.java.en.When;


public class Steps {
    private Beer beer;
    private Brewery brewery;


    @When("^добавление Крон Бланш$")
    public void addKron() throws Throwable {
        beer.setName("Крон Бланш");
        beer.setType("Бланш");
        beer.setAlcoStrength(4.7f);
        brewery.addBeer(beer);
    }

    @When("^добавление Балтика 3$")
    public void addBalt() throws Throwable {
        beer.setName("Балтика 3");
        beer.setType("Лагер");
        beer.setAlcoStrength(4.5f);
    }

    @When("^добавление Hoegaarden$")
    public void addHoeggarden() throws Throwable {
        beer.setName("Hoegaarden");
        beer.setType("Пилзнер");
        beer.setAlcoStrength(4.6f);
    }
}
