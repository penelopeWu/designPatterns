package visitor.eg.OASystem;

import visitor.eg.OASystem.department.Department;
import visitor.eg.OASystem.department.FADepartment;
import visitor.eg.OASystem.department.HRDepartment;
import visitor.eg.OASystem.employee.Employee;
import visitor.eg.OASystem.employee.FullTimeEmployee;
import visitor.eg.OASystem.employee.PartTimeEmployee;

/**
 * Created by penelope on 2017/8/7.
 */
public class Client {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        Employee employee1 = new FullTimeEmployee("employee1",3200.0,45);
        Employee employee2 = new FullTimeEmployee("杨过",2000.00,40);
        Employee employee3 = new PartTimeEmployee("洪七公",80.00,20);
        Employee employee4 = new PartTimeEmployee("郭靖",60.00,18);
        employeeList.addEmployee(employee1);
        employeeList.addEmployee(employee2);
        employeeList.addEmployee(employee3);
        employeeList.addEmployee(employee4);

        Department fa = new FADepartment();
        Department hr = new HRDepartment();

        employeeList.accept(fa);

        employeeList.accept(hr);


    }
}
