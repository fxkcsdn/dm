package FactoryMethod;

public class AddOperationFactory implements OperationFactory{
    public Operation createOperation() {
        return new AddOperation();
    }
}
