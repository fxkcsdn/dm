package EasyFactory;

public class AddOperation extends Operation {

    public AddOperation(double num1,double num2){
        super(num1,num2);
    }

    double compute() {
        return num1+num2;
    }
}
