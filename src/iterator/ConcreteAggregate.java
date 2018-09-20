package iterator;

/**聚合类的子类，一方面负责存储数据，
 * 另一方面实现了在抽象聚合类中声明的工厂方法createIterator(),
 * 用于返回一个与该具体聚合类对应的具体迭代器对象。
 * Created by penelope on 2017/8/9.
 */
public class ConcreteAggregate implements Aggregate {
    //存储数据。。。略


    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
