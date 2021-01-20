package Decorate;

public abstract class DressDecorate implements People{

    People people;

    public  DressDecorate(People people){
        this.people=people;
    }

    public void dress(){
        people.dress();
    }
}
