package Proxy;

public class Client {
    public static void main(String[] args) {
        Subject realSubject=new RealSubject();
        Subject proxySubject=new ProxySubject(realSubject);
        proxySubject.request();
    }
}
