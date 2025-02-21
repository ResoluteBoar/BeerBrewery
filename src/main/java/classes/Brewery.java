package classes;

import java.util.ArrayList;

public class Brewery {
    private String name;
    private String address;
    private ArrayList beerTypes = new ArrayList<Beer>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList getBeerTypes() {
        return beerTypes;
    }

    public void setBeerTypes(ArrayList beerTypes) {
        this.beerTypes = beerTypes;
    }

    public void addBeer(Beer beer){
        beerTypes.add(beer);
    }

}