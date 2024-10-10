package Creational_DP.Abstruct_Factory_DP;

public class Main {
    public static void main(String[] args) {
        Employee employee = Employee_Factory.getEmployee(new AndroidDev_Factory());
        System.out.println(employee.name() + " " + employee.salary());


        Employee employee2 = Employee_Factory.getEmployee(new WebDev_Factory());
        System.out.println(employee2.name() + " " + employee2.salary());
    }
}
