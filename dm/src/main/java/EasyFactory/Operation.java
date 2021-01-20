package EasyFactory;

public abstract class Operation {


    double num1;
    double num2;
    public Operation(double num1,double num2){
        this.num1=num1;
        this.num2=num2;
    }
    abstract double compute();

}
