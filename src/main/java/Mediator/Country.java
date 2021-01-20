package Mediator;

public abstract class Country {

    protected UnitNations unitNations;

    public Country(UnitNations unitNations){
        this.unitNations=unitNations;
    }

    abstract void sendMessage(String message);

    abstract void getMessage(String message);
}
