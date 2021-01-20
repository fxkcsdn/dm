package Observer;

public class NBAObserver implements  Observer{

    ConcreteSubject subject;

    String name;

    public NBAObserver(ConcreteSubject subject,String name){
        this.subject=subject;
        this.name=name;
    }

    public void update() {
        System.out.println("观察者"+name+"发现主题的状态为"+subject.getState());
    }
}
