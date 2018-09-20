package observer.eg;

/**
 * 抽象观察类
 * Created by penelope on 2017/8/9.
 */
public interface Observer {
    String getName();
    void setName(String name);
    void help();//声明支援盟友方法
    void beAttacked(AllyControlCenter controlCenter);
}
