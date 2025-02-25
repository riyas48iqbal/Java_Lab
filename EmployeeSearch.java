import java.util.Scanner;

class Employee {
    int empNumber;
    String name;
    double salary;
    public Employee(int empNumber, String name, double salary) {
        this.empNumber = empNumber;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeSearch {
    public static void main(String[] args) {
	System.out.print("Enter the no:of Employee: ");
        Scanner scanner = new Scanner(System.in);
	int n=scanner.nextInt();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < employees.length; i++) {
            System.out.print("Enter Employee Number: ");
            int empNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Employee Salary: ");
            double salary = scanner.nextDouble();
            employees[i] = new Employee(empNumber, name, salary);
	    System.out.println();
        }
        System.out.print("\nEnter Employee Number to Search: ");
        int searchEmpNumber = scanner.nextInt();
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.empNumber == searchEmpNumber) {
                System.out.println("\nEmployee Found!");
                System.out.println("Employee Number: " + emp.empNumber);
                System.out.println("Employee Name: " + emp.name);
                System.out.println("Employee Salary: " + emp.salary);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nEmployee with number " + searchEmpNumber + " not found.");
        }

        scanner.close();
    }
}
