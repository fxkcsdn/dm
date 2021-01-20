package State.after;

public class Common implements HeroState {
    public void run(Hero hero) throws InterruptedException {
        System.out.println("正常行走");
        Thread.sleep(1000);
    }
}
