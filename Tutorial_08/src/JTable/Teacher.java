package JTable;

public class Teacher extends Person{

    private double salary;

    public Teacher() {
        super();
    }

    public Teacher(String name, double salary) {
        super(name);
        salary = 15000;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return ("The name of the employee is " + this.getName() + " the salary is " + salary);
    }
}
