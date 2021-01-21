package Visitor;

public class ConcreteVistorA implements Visitor {

    public void visitConcreteElementA() {
        System.out.println("visitConcreteElementA");
    }

    public void visitConcreteElementB() {
        System.out.println("visitConcreteElementB");
    }
}
