package Adapter;

public class OldObjectAdapter implements NewObject{

    OldObject oldObject=new OldObject();
    public void addObject() {
        oldObject.insert();
    }
}
