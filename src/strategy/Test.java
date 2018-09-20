package strategy;

/**
 * Created by penelope on 2017/8/7.
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategy = new ConcreteStrategyA();//运行时指定使用哪种策略。
        context.setStrategy(strategy);
        context.algorithm();
    }
}
