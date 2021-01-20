package Adapter;

public class Client {

    public static void main(String[] args) {
        NewObject newObject=new OldObjectAdapter();
        newObject.addObject();
    }
}
