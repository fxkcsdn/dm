package Bridged;

public class Client {

    public static void main(String[] args) {
        Phone phone=new ApplePhone();
        SoftWare softWare=new LOL();
        phone.setSoftWare(softWare);
        phone.run();
    }
}
