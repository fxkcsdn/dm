package ChainOfResponsibility;

public abstract class Manager {
    protected Manager next;

    public void setManager(Manager manager){
        next=manager;
    }

    abstract void handle(int days);
}
