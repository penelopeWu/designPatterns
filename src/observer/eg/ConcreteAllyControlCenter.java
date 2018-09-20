package observer.eg;

/**
 * Created by penelope on 2017/8/9.
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {

    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功");
        this.allyName = allyName;
    }

    @Override
    public void notifyObserver(String observerName) {
        System.out.println(this.allyName + "战队紧急通知，盟友" + observerName + "遭受敌人攻击");
        for (Object player : players) {
            if (!((Observer) player).getName().equalsIgnoreCase(observerName)) {
                ((Observer) player).help();
            }
        }
    }
}
