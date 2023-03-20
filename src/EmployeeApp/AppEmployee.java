package EmployeeApp;

import EmployeeEntities.Employee;

import javax.naming.Name;
import java.util.Locale;
import java.util.Scanner;

public class AppEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Name: ");
        employee.Name = scan.nextLine();
        System.out.println("Gross Salary: ");
        employee.GrossSalary = scan.nextDouble();
        System.out.println("Tax: ");
        employee.Tax = scan.nextDouble();

        System.out.println();
        System.out.printf("Employee: %s", employee.Name+ " $ " +employee.netSalary());
        System.out.println();

        System.out.print("Which percentage to increase salary: ");
        double percentage = scan.nextDouble();
        employee.increaseSalary(percentage);

        System.out.printf("Update Data: "+ employee);
        scan.close();
    }
}
