package ChainOfResponsibility;

public class MajorManager extends Manager {


    void handle(int days) {
        if(days<10){
            System.out.println("请假少于10天，主管决定");
        }else{
            this.next.handle(days);
        }
    }
}
