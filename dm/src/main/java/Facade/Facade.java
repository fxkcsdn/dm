package Facade;

public class Facade {

    private SubSystemOne subSystemOne=new SubSystemOne();

    private SubSystemTwo subSystemTwo=new SubSystemTwo();

    public void methodA(){
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
    }


}
