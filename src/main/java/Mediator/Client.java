package Mediator;

public class Client {

    public static void main(String[] args) {
        UnitNations unitNations=new UnitNations();
        USA USA=new USA(unitNations);
        China china=new China(unitNations);
        unitNations.addCountry(USA);
        unitNations.addCountry(china);

        china.sendMessage("中美友谊万岁");
    }
}
