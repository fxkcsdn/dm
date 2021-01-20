package Composite;

public class Client {
    public static void main(String[] args) {
        File dir =new Folder("根目录");
        File aFolder =new Folder("a");
        File bText =new TextFile("b.txt");
        dir.add(aFolder);
        dir.add(bText);
        File cText =new Folder("c.txt");
        aFolder.add(cText);
        dir.display();

    }
}
