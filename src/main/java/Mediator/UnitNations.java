package Mediator;

import sun.plugin2.message.Message;

import java.util.ArrayList;
import java.util.List;

public class UnitNations {

    private List<Country> countryList=new ArrayList<Country>();

    public void addCountry(Country country){
        this.countryList.add(country);
    }

    public void sendMessage(Country country, String message){
        for(Country country1:countryList){
            if(country1.equals(country)){
               continue;
            }
            country1.getMessage(message);
        }
    }

}
