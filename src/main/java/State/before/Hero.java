package State.before;

import Strategy.CommonCash;

public class Hero {

    public static final int COMMON=0;// 正常状态

    public static final int SPEED_UP=1;// 加速状态

    public static final int SPEED_DOWN=2;// 减速状态

    public static final int SWIM=3;// 眩晕状态

    private int state=COMMON;

    private Thread runThread=null;

    public void startRun(){
        if(isRunning()){
            return;
        }
        final Hero hero=this;
        runThread=new Thread(new Runnable() {
            public void run() {
                while (!runThread.isInterrupted()){
                    try{
                        hero.run();
                    }catch (InterruptedException e){
                        break;
                    }
                }
            }
        });
        System.out.println("开始跑动");
        runThread.start();
    }

    private void run() throws InterruptedException {
        if(state==SPEED_UP){
            System.out.println("英雄加速4秒钟");
            Thread.sleep(4000);
            state= COMMON;
        }else if(state==SPEED_DOWN){
            System.out.println("英雄减速4秒钟");
            Thread.sleep(4000);
            state= COMMON;
        }else if(state==SWIM){
            System.out.println("英雄眩晕2秒钟");
            Thread.sleep(2000);
            state= COMMON;
        }else{
            System.out.println("正常行走");
            Thread.sleep(1000);
        }

    }

    private boolean isRunning(){
        return runThread!=null&&!runThread.isInterrupted();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
