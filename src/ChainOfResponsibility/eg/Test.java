package ChainOfResponsibility.eg;

import ChainOfResponsibility.eg.approvers.Director;
import ChainOfResponsibility.eg.approvers.President;
import ChainOfResponsibility.eg.approvers.VicePresident;

/**
 * Created by penelope on 2017/8/7.
 */
public class Test {
    public static void main(String[] args) {
        Approver director, vicePresident, president;
        director = new Director("director");
        vicePresident = new VicePresident("vicePresident");
        president = new President("president");

        //创建职责链:链的创建过程由客户端负责，因此增加新的具体处理者类对原有类库无任何影响，无须修改已有类的源代码，符合“开闭原则”。
        director.setApprover(vicePresident);
        vicePresident.setApprover(president);

        //创建采购单
        PurchaseRequest request_1 = new PurchaseRequest(45000, 10001, "购买倚天剑");
        director.processRequest(request_1);

        PurchaseRequest request_2 = new PurchaseRequest(60000, 10002, "购买《葵花宝典》");
        director.processRequest(request_2);

        PurchaseRequest request_3 = new PurchaseRequest(160000,10003,"购买《金刚经》");
        director.processRequest(request_3);

    }
}
