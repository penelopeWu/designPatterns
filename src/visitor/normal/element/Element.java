package visitor.normal.element;

import visitor.normal.visitor.Visitor;

/**
 * Created by penelope on 2017/8/7.
 */
public interface Element {
    void accept(Visitor visitor);
}
