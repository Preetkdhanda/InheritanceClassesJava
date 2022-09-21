package Staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private Integer salary;

    public Employee(String name, String niNumber, Integer salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(String niNumber) {
        this.niNumber = niNumber;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void raiseSalary(double raise){
        if (raise >= 0 ){
       this.salary = (int)(this.salary + raise);}

    }

    public double payBonus(){

      return (this.salary + (this.salary / 100 * 1));

    }

}
