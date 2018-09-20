package visitor.eg.OASystem;

import visitor.eg.OASystem.department.Department;
import visitor.eg.OASystem.employee.Employee;

import java.util.ArrayList;

/**
 * Created by penelope on 2017/8/7.
 */
public class EmployeeList {
    //定义一个集合用于存储员工对象
    private ArrayList<Employee> list = new ArrayList<Employee>();

    public void addEmployee(Employee e) {
        list.add(e);
    }

    //遍历访问员工集合中的每一个员工对象
    public void accept(Department handler) {
        for (Employee e : list) {
            e.accept(handler);
        }
    }

}
