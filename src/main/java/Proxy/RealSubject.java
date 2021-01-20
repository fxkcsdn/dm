package Proxy;

public class RealSubject implements Subject {
    public void request() {
        System.out.println("请求到了RealSubject");
    }
}
