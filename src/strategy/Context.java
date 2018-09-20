package strategy;

/**
 * Created by penelope on 2017/8/7.
 */
public class Context {

    //维持一个策略接口的引用
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }


    public void algorithm(){
        //调用策略类中的具体算法
        strategy.algorithm();
    }
}
