import java.util.ArrayList;
import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Worker("Jacek", 13000, 1));
        employees.add(new Worker("Tomek", 18000, 2));
        employees.add(new Worker("Artur", 15000, 3));
        employees.add(new Worker("Wojciech", 5400, 4));
        Manager m1 = new Manager("Przemek", 25000, 5);

        for (Employee e : employees) {
            System.out.println(e.getName() + " salary is " + e.getSalary());
            e.work();
        }
        
        System.out.println(m1.getName() + " salary is " + m1.getSalary());
        m1.work();
    }
}
