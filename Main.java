import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Worker("Wojtek", 10000, 1, "2020-01-10", "Senior Presales"));
        employees.add(new Worker("Jacek", 12000, 1, "2022-05-13", "Junior Presales"));
        employees.add(new Worker("Artur", 19000, 3, "2012-05-11", "Junior Presales"));
        Employee w1 = employees.get(0);
    
        employees.add(new Manager("Przemek", 21000, 4, "2010-11-29", "Director Presales"));
    
        for (Employee e : employees) {
            System.out.println(e.getName() + " has code: " + e.hashCode());
        }
    
        System.out.println("Comparing w1 with ID 1 with the rest of the employees");
        for (Employee e : employees) {
            System.out.println("Comparing " + w1.getName() + " and " + e.getName() + ": " + w1.equals(e));
        }
    }
    
}
