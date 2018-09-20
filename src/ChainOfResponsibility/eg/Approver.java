package ChainOfResponsibility.eg;

/**
 * Created by penelope on 2017/8/7.
 */

/**
 * 审批者
 */
public abstract class Approver {
    protected Approver successor;//后继审批者
    protected String name;//审批者姓名

    public Approver(String name){
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.successor = approver;
    }

    public abstract void processRequest(PurchaseRequest request);
}
