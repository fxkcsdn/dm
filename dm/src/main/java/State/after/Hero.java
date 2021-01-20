package State.after;

public class Hero {

    public static final HeroState COMMON=new Common();// 正常状态

    public static final HeroState SPEED_UP=new SpeedUp();// 加速状态

    public static final HeroState SPEED_DOWN=new SpeedDown();// 减速状态

    public static final HeroState SWIM=new Swim();// 眩晕状态

    private HeroState state=COMMON;

    private Thread runThread=null;

    public HeroState getState() {
        return state;
    }

    public void setState(HeroState state) {
        this.state = state;
    }

    private boolean isRunning(){
        return runThread!=null&&!runThread.isInterrupted();
    }

    public void startRun(){
        if(isRunning()){
            return;
        }
        final Hero hero=this;
        runThread=new Thread(new Runnable() {
            public void run() {
                while(!runThread.isInterrupted()){
                    try {
                        state.run(hero);
                    } catch (InterruptedException e) {
                        break;
                    }
                }
            }
        });
        System.out.println("开始跑动");
        runThread.start();
    }
}
