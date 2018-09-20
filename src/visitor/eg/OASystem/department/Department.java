package visitor.eg.OASystem.department;

import visitor.eg.OASystem.employee.FullTimeEmployee;
import visitor.eg.OASystem.employee.PartTimeEmployee;

/**
 * Created by penelope on 2017/8/7.
 */
public abstract class Department {
    //声明一组重载的访问方法，用于访问不同类型的具体元素
    public abstract void visit(FullTimeEmployee employee);

    public abstract void visit(PartTimeEmployee employee);

}
