package Builder;

public class Client {

    public static void main(String[] args) {
        PersonBuilder slimPersonBuilder=new SlimPersonBuilder();
        PersonBuilderDirector personBuilderDirector=new PersonBuilderDirector(slimPersonBuilder);
        Person person = personBuilderDirector.buildPerson();
        System.out.println(person);
    }
}
