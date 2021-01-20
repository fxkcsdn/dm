package Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {

    public Folder(String name){
        super(name);
    }

    private List<File> files=new ArrayList<File>();

    @Override
    public void add(File file){
        files.add(file);
    }

    @Override
    public void delete(File file){
        files.remove(file);
    }

    public void display() {
        System.out.println("当前目录："+name);
        for (File file:files){
            file.display();
        }
    }
}
