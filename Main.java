import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Worker("Wojtek", 10000, 1, "2020-01-10", "Senior Presales"));
        employees.add(new Worker("Jacek", 12000, 2, "2022-05-13", "Junior Presales"));
        employees.add(new Worker("Artur", 19000, 3, "2012-05-11", "Junior Presales"));
        employees.add(new Worker("Tomek", 13000, 4, "2015-02-13", "Mid Presales"));
        employees.add(new Manager("Przemek", 21000, 5, "2010-11-29", "Director Presales"));

        for (Employee e : employees) {
            e.work();
            System.out.println("-" + e.getName() + " (ID: " + e.getId() + ", Position: " + e.getPosition() + ", Hire date: " + e.getHireDate() + ", Salary: PLN " + e.getSalary());
        }
    }
}
