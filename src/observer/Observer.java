package observer;

/**
 * Observer（观察者）：观察者将对观察目标的改变做出反应，
 * 观察者一般定义为接口，该接口声明了更新数据的方法update()，因此又称为抽象观察者。
 * Created by penelope on 2017/8/8.
 */
public interface Observer {
    void update();
}
