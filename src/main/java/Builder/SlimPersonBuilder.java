package Builder;

public class SlimPersonBuilder extends PersonBuilder{

    Person person=new Person();

    void buildHead() {
        person.setHead("构造苗条的头部");
    }

    void buildBody() {
        person.setBody("构造苗条的身体");
    }

    Person getResult() {
        return person;
    }
}
