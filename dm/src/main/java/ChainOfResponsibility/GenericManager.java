package ChainOfResponsibility;

public class GenericManager extends Manager {

    void handle(int days) {
        if(days<20){
            System.out.println("请假小于20天，总经理决定");
        }else{
            if(next!=null){
                next.handle(days);
            }
        }
    }
}
