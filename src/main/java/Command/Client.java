package Command;

public class Client {
    public static void main(String[] args) {
        // 新店开业，配置厨师和服务员
        Cooker cooker=new Cooker();
        Waiter waiter=new Waiter();
        Command makeFoodACommand=new MakeFoodACommand();
        makeFoodACommand.setCooker(cooker);
        Command makeFoodBCommand=new MakeFoodBCommand();
        makeFoodBCommand.setCooker(cooker);

        //客人点餐
        waiter.addFood(makeFoodACommand);
        waiter.addFood(makeFoodBCommand);
        waiter.nofifyCooker();
    }
}
