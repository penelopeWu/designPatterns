package observer.eg;

/**
 * Created by penelope on 2017/8/9.
 */
public class Client {
    public static void main(String[] args) {
        AllyControlCenter controlCenter = new ConcreteAllyControlCenter("金庸群侠");
        Observer player1,player2,player3,player4;
        player1 = new Player("杨过");
        player2 = new Player("令狐冲");
        player3 = new Player("张无忌");
        player4 = new Player("段誉");
        controlCenter.join(player1);
        controlCenter.join(player2);
        controlCenter.join(player3);
        controlCenter.join(player4);

        player1.beAttacked(controlCenter);
    }
}
