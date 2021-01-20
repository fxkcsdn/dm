package Mediator;

public class China extends   Country{

    public China(UnitNations unitNations){
        super(unitNations);
    }

    public void sendMessage(String message) {
        this.unitNations.sendMessage(this,message);
    }

    void getMessage(String message) {
        System.out.println("中国收到："+message);
    }
}
