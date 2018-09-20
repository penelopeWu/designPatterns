package iterator;

/**
 * 需要注意的是抽象迭代器接口的设计非常重要，
 * 一方面需要充分满足各种遍历操作的要求，
 * 尽量为各种遍历方法都提供声明，另一方面又不能包含太多方法，
 * 接口中方法太多将给子类的实现带来麻烦。
 * Created by penelope on 2017/8/9.
 */
public interface Iterator {
    void first();
    void next();
    boolean hasNext();
    Object currentItem();
}
