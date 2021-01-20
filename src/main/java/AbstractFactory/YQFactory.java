package AbstractFactory;

public class YQFactory implements Factory{

    public CarBody createCarBody() {
        return new YQCarBody();
    }

    public Wheel createWheel() {
        return new YQWheel();
    }
}
