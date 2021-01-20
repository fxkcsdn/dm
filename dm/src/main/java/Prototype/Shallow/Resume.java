package Prototype.Shallow;

public abstract class Resume implements Cloneable{

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

    @Override
    protected Resume clone() {
        try {
            return (Resume)super.clone();
        }catch (Exception e){
            System.out.println("不支持克隆方法！");
            return null;
        }

    }
}
