package Strategy;

import Observer.ConcreteSubject;

public class Client {
    public static void main(String[] args) {
        Context context=new Context(new RebateCash(1));
        context.getCash(100);
    }
}
