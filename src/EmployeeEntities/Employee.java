package EmployeeEntities;

public class Employee {
    public String Name;
    public double GrossSalary;
    public double Tax;

    public double netSalary(){
        return GrossSalary - Tax;
    }
    public void increaseSalary(double percentage){
        GrossSalary += GrossSalary * percentage/100;
    }
    public String toString(){
    return Name + ", $"+ String.format("%.2f",netSalary());
    }
}
