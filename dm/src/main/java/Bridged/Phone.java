package Bridged;

public  abstract class Phone {
    SoftWare softWare;

    public void setSoftWare(SoftWare softWare) {
        this.softWare = softWare;
    }

    /**
     * 手机启动
     */
    abstract void run();
}
