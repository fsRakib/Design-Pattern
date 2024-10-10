package Creational_DP.Factory_DP;

public class Main {
    public static void main(String[] args) {
        Employee employee = Employee_Factory.getEmployee("android");
        System.out.println(employee.salary());

        System.out.println(Employee_Factory.getEmployee("web").salary());
    }
}
