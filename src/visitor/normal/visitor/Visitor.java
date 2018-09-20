package visitor.normal.visitor;

import visitor.normal.element.ConcreteElementA;
import visitor.normal.element.ConcreteElementB;

/**
 * Created by penelope on 2017/8/7.
 */
public interface Visitor {
    public abstract void visit(ConcreteElementA elementA);
    public abstract void visit(ConcreteElementB elementB);
}
