package visitor.eg.OASystem.employee;

import visitor.eg.OASystem.department.Department;

/**
 * Created by penelope on 2017/8/7.
 */
public interface Employee {
    void accept(Department handler);
}
