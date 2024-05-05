import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;
        ArrayList<Employee> employees = new ArrayList<>();
        
        employees.add(new Worker("Wojtek", 10000, 1, "2020-01-10", "Senior Presales"));
        employees.add(new Worker("Jacek", 12000, 2, "2022-05-13", "Junior Presales"));
        employees.add(new Worker("Artur", 19000, 1, "2012-05-11", "Junior Presales"));
        employees.add(new Manager("Przemek", 21000, 1, "2010-11-29", "Director Presales"));
        employees.add(new Manager("Tomasz", 25000, 5, "2015-09-20", "Project Manager"));
        employees.add(new Worker("Michał", 8000, 6, "2018-03-05", "PM"));
        employees.add(new Manager("Kamil", 28000, 7, "2013-07-15", "Senior Manager"));
        
        for (Employee e : employees) {
            totalSalary += e.getSalary();
            if (e instanceof Manager) {
                totalManagerSalary += e.getSalary();
            } else if (e instanceof Worker) {
                totalWorkerSalary += e.getSalary();
            }
        }

        System.out.println("Całkowita suma pensji wszystkich pracowników: " + totalSalary);
        System.out.println("Całkowita suma pensji wszystkich Managerów: " + totalManagerSalary);
        System.out.println("Całkowita suma pensji wszystkich Workerów: " + totalWorkerSalary);

        System.out.println("\nInstancje pracowników z odpowiednimi ID:");
        for (Employee e : employees) {
            for (Employee o : employees) {
                if (e.getId() == o.getId() && e != o) {
                    System.out.println(e.getName() + " (ID: " + e.getId() + ") ma to samo ID co : " + o.getName()+" ID ("+o.getId()+")");
                }
            }
        }
    }
}
