public abstract class Employee {

    private String name;
    private int niNo;
    private int salary;

    public Employee(String name, int niNo, int salary){
        this.name = name;
        this.niNo = niNo;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getNiNo() {
        return this.niNo;
    }

    public int getSalary() {
        return this.salary;
    }

    public void raiseSalary(double salaryIncrease){
        if (salaryIncrease > 0) {
            this.salary += salaryIncrease;
        }
    }

    public double payBonus(){
        return (this.salary / 100.0);
    }

//    test in DirectorTest
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
}
