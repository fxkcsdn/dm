package Prototype.Shallow;

public class Client {
    public static void main(String[] args) {
        Resume resume=new StudentResume();
        resume.setName("zhangsan");
        resume.setAddress(new Address("beijing"));
        // 克隆简历，并修改
        Resume resume1 = resume.clone();
        resume1.setName("lisi");
        resume1.getAddress().setInfo("shanghai");
        System.out.println(resume.toString());
        System.out.println(resume1.toString());
    }
}
