public class Manager extends Employee {

    private String deptName;

    public Manager(String name, int niNo, int salary, String deptName){
        super(name, niNo, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return this.deptName;
    }
}
