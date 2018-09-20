package visitor.normal;

import visitor.normal.element.Element;
import visitor.normal.visitor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by penelope on 2017/8/7.
 */
public class ObjectStructure {
    private List<Element> elementList = new ArrayList<Element>();

    public void accept(Visitor visitor){
        Iterator it = elementList.iterator();
        while (it.hasNext()){
            ((Element)it.next()).accept(visitor);
        }
    }

    public void addElement(Element e){
        elementList.add(e);
    }

    public void removeElement(Element e){
        elementList.remove(e);
    }
}
