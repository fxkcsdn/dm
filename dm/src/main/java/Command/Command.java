package Command;

public abstract class Command {

    Cooker cooker;

    public void setCooker(Cooker cooker) {
        this.cooker = cooker;
    }

    abstract void executeCommand();
}
