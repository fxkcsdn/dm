package Proxy;

public class ProxySubject implements  Subject {

    Subject subject;
    public ProxySubject(Subject subject){
        this.subject=subject;
    }
    public void request() {
        System.out.println("请求先到代理对象");
        subject.request();
    }
}
