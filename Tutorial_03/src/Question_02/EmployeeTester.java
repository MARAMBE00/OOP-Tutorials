package Question_02;

public class EmployeeTester {

    public static void main(String[] args) {

        Employee employee = new Employee();
        System.out.println("Employee name is: " + employee.getName("Joe") + "\n" +
                "Employee salary is: Rs: " + employee.getSalary(12000));
    }
}
