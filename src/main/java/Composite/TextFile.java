package Composite;

import java.util.ArrayList;
import java.util.List;

public class TextFile extends File {

    public TextFile(String name){
        super(name);
    }

    public void display() {
        System.out.println("文本文件:"+name);
    }
}
