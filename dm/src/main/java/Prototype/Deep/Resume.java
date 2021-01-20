package Prototype.Deep;

import java.io.*;

public abstract class Resume implements Cloneable, Serializable {

    private String name;

    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    protected Resume deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bo=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bo);
        oos.writeObject(this);
        ByteArrayInputStream bi=new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi=new ObjectInputStream(bi);
        return (Resume) oi.readObject();
    }
}
