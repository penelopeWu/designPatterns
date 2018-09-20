package observer;

/**
 *  ConcreteObserver（具体观察者）：在具体观察者中维护一个指向具体目标对象的引用，
 *  它存储具体观察者的有关状态，这些状态需要和具体目标的状态保持一致；
 *  它实现了在抽象观察者Observer中定义的update()方法。
 *  通常在实现时，可以调用具体目标类的attach()方法,
 *  将自己添加到目标类的集合中或通过detach()方法将自己从目标类的集合中删除。
 * Created by penelope on 2017/8/8.
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {

    }
}
