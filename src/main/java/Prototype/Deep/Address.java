package Prototype.Deep;

import java.io.Serializable;

public class Address implements Serializable {
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
