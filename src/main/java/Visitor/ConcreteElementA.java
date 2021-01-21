package Visitor;

public class ConcreteElementA implements Element {

    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA();
    }
}
