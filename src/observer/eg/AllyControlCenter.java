package observer.eg;

import java.util.ArrayList;

/**
 * Created by penelope on 2017/8/9.
 */
public abstract class AllyControlCenter {

    protected String allyName;

    protected ArrayList<Observer> players = new ArrayList<>();

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public String getAllyName() {
        return allyName;
    }

    public void join(Observer observer){
        System.out.println(observer.getName() + "加入" +this.getAllyName()+"战队");
        players.add(observer);
    }
    public void quit(Observer observer){
        System.out.println(observer.getName()+"退出"+this.getAllyName()+"战队");
        players.remove(observer);
    }

    public abstract void notifyObserver(String name);
}
