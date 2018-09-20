package visitor.eg.OASystem.employee;

import visitor.eg.OASystem.department.Department;

/**
 * Created by penelope on 2017/8/7.
 */
public class PartTimeEmployee implements Employee {

    private String name;
    private double hourlyWage;
    private int workTime;

    public PartTimeEmployee(String name, double hourlyWage, int workTime) {
        this.name = name;
        this.hourlyWage = hourlyWage;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @Override
    public void accept(Department handler) {
        handler.visit(this);
    }
}
