package Memento;

public class Client {
    public static void main(String[] args) {
        GameRole gameRole=new GameRole();
        gameRole.init();
        gameRole.display();
        GameRoleMemento gameRoleMemento = gameRole.saveState();
        GameRoleCaretaker gameRoleCaretaker=new GameRoleCaretaker(gameRoleMemento);
        gameRole.fight();
        gameRole.display();
        gameRole.recoveryState(gameRoleCaretaker.getGameRoleMemento());
        gameRole.display();
    }
}
