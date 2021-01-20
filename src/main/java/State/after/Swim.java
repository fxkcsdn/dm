package State.after;

public class Swim implements HeroState {
    public void run(Hero hero) throws InterruptedException {
        System.out.println("英雄眩晕2秒钟");
        Thread.sleep(2000);
        hero.setState(Hero.COMMON);
    }
}
