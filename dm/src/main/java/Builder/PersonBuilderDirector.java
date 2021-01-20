package Builder;

public class PersonBuilderDirector {

    private PersonBuilder personBuilder;

    public PersonBuilderDirector(PersonBuilder personBuilder){
        this.personBuilder=personBuilder;
    }

    Person buildPerson(){
        personBuilder.buildHead();
        personBuilder.buildBody();
        return personBuilder.getResult();
    }
}
