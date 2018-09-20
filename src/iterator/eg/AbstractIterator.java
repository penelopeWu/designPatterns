package iterator.eg;

/**
 * Created by penelope on 2017/8/9.
 */
public interface AbstractIterator {
    void next();
    boolean isLast();
    void previous();
    boolean isFirst();
    Object getNextItem();
    Object getPreviousItem();
}
