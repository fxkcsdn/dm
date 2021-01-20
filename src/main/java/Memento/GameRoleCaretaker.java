package Memento;

public class GameRoleCaretaker {

    private GameRoleMemento gameRoleMemento;

    public GameRoleCaretaker(GameRoleMemento gameRoleMemento){
        this.gameRoleMemento=gameRoleMemento;
    }

    public GameRoleMemento getGameRoleMemento() {
        return gameRoleMemento;
    }
}
