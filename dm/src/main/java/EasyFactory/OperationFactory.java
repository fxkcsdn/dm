package EasyFactory;

public class OperationFactory {

    private Operation operation;

    public Operation createOperation(double num1,double num2,char operator){
        switch (operator) {
            case '+':
                operation = new AddOperation(num1, num2);
                break;
        }
        return operation;
    }
}
