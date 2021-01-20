package Command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    List<Command> commandList=new ArrayList<Command>();

    public void addFood(Command command){
        commandList.add(command);
    }

    public void cancelFood(Command command){
        commandList.remove(command);
    }

    public void nofifyCooker(){
        for (Command command:commandList){
            command.executeCommand();
        }
    }
}
