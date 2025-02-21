import classes.Beer;
import classes.Brewery;
import io.cucumber.java.en.When;


public class Steps {
    private Brewery brewery;


    @When("^пользователь добавляет \"(.*)\"$")
    public void add_name_step(Beer beer, String name) throws Throwable {
        beer.setName(name);
    }

    @When("^пользователь указывает крепость \"(.*)\"$")
    public void add_alcstr_step(Beer beer, Float alcoStr) throws Throwable {
        beer.setAlcoStrength(alcoStr);
    }

    @When("^пользователь выбирает тип напитка \"(.*)\"$")
    public void add_type_step(Beer beer, String type) throws Throwable {
        beer.setType(type);
    }


    @When("^пользователь выбирает название пивоварни \"(.*)\"$")
    public void add_brewery_step(Brewery brewery,String name){
        brewery.setName(name);
    }
    @When("^пользователь указывает адрес пивоваренной компании \"(.*)\"$")
    public void add_brew_address(Brewery brewery, String address){
        brewery.setAddress(address);
    }
    @When("^пользователь добавляет \"(.*)\" в БД пивоварни \"(.*)\"$")
    public void add_beer_to_brewery_step(Brewery brewery, Beer beer){
        brewery.addBeer(beer);
    }
}
