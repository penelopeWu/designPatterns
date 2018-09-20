package visitor.eg.OASystem.department;

import visitor.eg.OASystem.employee.FullTimeEmployee;
import visitor.eg.OASystem.employee.PartTimeEmployee;

/**
 * Created by penelope on 2017/8/7.
 */
public class HRDepartment extends Department {
    @Override
    public void visit(FullTimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("正式员工" + employee.getName() + "实际工作时间为：" + workTime + "小时。");
        if (workTime > 40) {
            System.out.println("正式员工" + employee.getName() + "加班时间为：" + (workTime - 40) + "小时。");
        } else if (workTime < 40) {
            System.out.println("正式员工" + employee.getName() + "请假时间为：" + (40 - workTime) + "小时。");
        }
    }

    @Override
    public void visit(PartTimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("临时工" + employee.getName() + "实际工作时间为：" + workTime + "小时。");
    }
}
