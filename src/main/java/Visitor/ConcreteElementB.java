package Visitor;

public class ConcreteElementB implements Element {

    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB();
    }
}
