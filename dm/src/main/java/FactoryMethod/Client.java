package FactoryMethod;

public class Client {

    public static void main(String[] args) {
        OperationFactory op=new AddOperationFactory();
        Operation operation = op.createOperation();
        double result = operation.compute(1, 2);
        System.out.println(result);
    }
}
