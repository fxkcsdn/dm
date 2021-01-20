package State.after;

public class SpeedDown implements HeroState {
    public void run(Hero hero) throws InterruptedException {
        System.out.println("英雄减速4秒钟");
        Thread.sleep(4000);
        hero.setState(Hero.COMMON);
    }
}
