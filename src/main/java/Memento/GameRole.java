package Memento;

public class GameRole {

    private int vitality;// 生命值

    private int attack;// 攻击力

    private int defence;// 防御力

    public void init(){
        vitality=100;
        attack=50;
        defence=30;
    }

    public GameRoleMemento saveState(){
        GameRoleMemento memento=new GameRoleMemento();
        memento.setAttack(this.attack);
        memento.setDefence(this.defence);
        memento.setVitality(vitality);
        return memento;
    }

    public void recoveryState(GameRoleMemento memento){
        this.attack=memento.getAttack();
        this.vitality=memento.getVitality();
        this.defence=memento.getDefence();
    }

    public void fight(){
        this.attack=0;
        this.defence=0;
        this.vitality=0;
    }

    public void display() {

        String s= "GameRole{" +
                "vitality=" + vitality +
                ", attack=" + attack +
                ", defence=" + defence +
                '}';
        System.out.println(s);
    }
}
