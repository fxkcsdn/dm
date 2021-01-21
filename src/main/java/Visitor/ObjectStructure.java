package Visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    List<Element> elementList=new ArrayList<Element>();

    public void addElement(Element element){
        elementList.add(element);
    }

    public void deleteElement(Element element){
        elementList.remove(element);
    }

    public void display(Visitor visitor){
        for(Element element:elementList){
            element.accept(visitor);
        }
    }
}
