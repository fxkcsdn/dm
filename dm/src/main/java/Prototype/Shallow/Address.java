package Prototype.Shallow;

public class Address {
    private String info;

    public Address(String info){
        this.info=info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Address{" +
                "info='" + info + '\'' +
                '}';
    }
}
