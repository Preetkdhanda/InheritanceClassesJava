package Management;

public class Director extends Manager{

    private Double budget;

    public Director(String name, String niNumber, Integer salary, String deptName, Double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public double payBonus(){
        return (salary + (salary / 100 * 2));
    }
}
