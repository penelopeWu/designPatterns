package ChainOfResponsibility;

/**
 * Created by penelope on 2017/8/7.
 */
public abstract class Handler {

    //后继handler
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(String request);
}
