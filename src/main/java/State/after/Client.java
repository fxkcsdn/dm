package State.after;

import State.before.Hero;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Hero hero=new Hero();
        hero.startRun();
        hero.setState(Hero.SPEED_UP);
        Thread.sleep(5000);
        hero.setState(Hero.SWIM);
    }
}
