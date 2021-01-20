package AbstractFactory;

public class Client {
    public static void main(String[] args) {
        Factory factory=new YQFactory();
        factory.createCarBody();
        factory.createWheel();
    }
}
