package Decorate;

public class Client {
    public static void main(String[] args) {
        People s=new Student();
        People td=new TShirtDecorate(s);
        People trd=new TrousersDecorate(td);
        trd.dress();
    }
}
