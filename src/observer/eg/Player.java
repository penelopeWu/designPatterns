package observer.eg;

/**
 * Created by penelope on 2017/8/8.
 */
public class Player implements Observer{
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
    this.name = name;
    }

    @Override
    public void help() {
        System.out.println("坚持住，"+this.name+"去救你了");
    }

    @Override
    public void beAttacked(AllyControlCenter controlCenter) {
        System.out.println(this.name + "被攻击了");
        controlCenter.notifyObserver(name);
    }
}
