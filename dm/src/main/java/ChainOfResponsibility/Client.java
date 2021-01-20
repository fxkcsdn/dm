package ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Manager majorManager=new MajorManager();
        Manager genericManager=new GenericManager();
        majorManager.setManager(genericManager);
        majorManager.handle(5);
    }
}
