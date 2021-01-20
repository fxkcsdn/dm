package Builder;

public class FatPersonBuilder extends PersonBuilder{

    Person person=new Person();

    void buildHead() {
        person.setHead("构造胖胖的头部");
    }

    void buildBody() {
        person.setBody("构造胖胖的身体");
    }

    Person getResult() {
        return person;
    }
}
