package Observer;

public class Client {

    public static void main(String[] args) {

        ConcreteSubject concreteSubject=new ConcreteSubject();
        NBAObserver zhangsan=new NBAObserver(concreteSubject,"zhangsan");
        NBAObserver lisi=new NBAObserver(concreteSubject,"lisi");
        concreteSubject.addObserver(zhangsan);
        concreteSubject.addObserver(lisi);
        concreteSubject.setState("老板来了");
        concreteSubject.notifyObservers();
    }
}
