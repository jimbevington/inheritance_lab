public class Director extends Manager {

    private int budget;

    public Director(String name, int niNo, int salary, String deptName, int budget) {
        super(name, niNo, salary, deptName);
        this.budget = budget;
    }

    public int getBudget() {
        return this.budget;
    }

    public double payBonus(){
        return (super.payBonus()) * 2;
    }
}
