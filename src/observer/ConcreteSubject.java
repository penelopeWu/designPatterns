package observer;

/**
 * ConcreteSubject（具体目标）：具体目标是目标类的子类，
 * 通常它包含有经常发生改变的数据，
 * 当它的状态发生改变时，向它的各个观察者发出通知；
 * 同时它还实现了在目标类中定义的抽象业务逻辑方法（如果有的话）。
 * 如果无须扩展目标类，则具体目标类可以省略。
 * Created by penelope on 2017/8/8.
 */
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
//遍历观察者集合，调用每一个观察者的响应方法
        for (Object obs : observers) {
            ((Observer) obs).update();
        }

    }
}
