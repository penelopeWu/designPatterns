package visitor.normal.element;

import visitor.normal.visitor.Visitor;

/**
 * Created by penelope on 2017/8/7.
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
