package Visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure=new ObjectStructure();
        objectStructure.addElement(new ConcreteElementA());
        objectStructure.addElement(new ConcreteElementB());

        ConcreteVistorA concreteVistor=new ConcreteVistorA();
        objectStructure.display(concreteVistor);
    }
}
