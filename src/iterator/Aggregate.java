package iterator;

/**
 * 聚合类用于存储数据并负责创建迭代器对象，
 * 最简单的抽象聚合类代码如下所示：
 * Created by penelope on 2017/8/9.
 */
public interface Aggregate {
    Iterator createIterator();
}
