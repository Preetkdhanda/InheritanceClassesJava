package Management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String niNumber, Integer salary, String deptName) {
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
