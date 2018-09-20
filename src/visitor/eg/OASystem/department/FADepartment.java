package visitor.eg.OASystem.department;

import visitor.eg.OASystem.employee.FullTimeEmployee;
import visitor.eg.OASystem.employee.PartTimeEmployee;

/**
 * //财务部类：具体访问者类
 * Created by penelope on 2017/8/7.
 */
public class FADepartment extends Department  {

    @Override
    public void visit(FullTimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double weekWage = employee.getWeeklyWage();
        if(workTime > 40){
            weekWage = weekWage + (workTime - 40)*100;
        }else if(workTime<40){
            weekWage = weekWage - (40-workTime)*80;
            if(weekWage<0){
                weekWage=0;
            }
        }
        System.out.println("正式员工" + employee.getName() + "实际工资为：" + weekWage + "元。");
    }

    @Override
    public void visit(PartTimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double hourWage = employee.getHourlyWage();
        System.out.println("临时工" + employee.getName() + "实际工资为：" + workTime * hourWage + "元。");
    }
}
