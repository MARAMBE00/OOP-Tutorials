package Question_02;

public class EmployeeTester {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("Pasindu", 50000);
        Employee e3 = new Employee("Rayan", 80000);

        System.out.println("e1 name: " + e1.getName() + ", salary: " + e1.getSalary());
        System.out.println("e2 name: " + e2.getName() + ", salary: " + e2.getSalary());
        System.out.println("e3 name: " + e3.getName() + ", salary: " + e3.getSalary());
    }
}
