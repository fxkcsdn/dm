package Composite;

public abstract class File {

    String name;

    public File(String name){
        this.name=name;
    }

    public  void add(File file){
        throw new RuntimeException("未实现此方法！");
    }

    public  void delete(File file){
        throw new RuntimeException("未实现此方法！");
    }

    public abstract void display();
}
