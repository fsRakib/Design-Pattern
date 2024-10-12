package Creational_DP.Abstruct_Factory_DP.Example_1;

public class Employee_Factory {
    public static Employee getEmployee(Employee_Abstruct_Factory factory) {
        return factory.createEmployee();
    }
}
