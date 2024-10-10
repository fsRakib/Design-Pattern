package Creational_DP.Factory_DP;

public class Employee_Factory {
    // get the employee
    public static Employee getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("android")) {
            return new AndroidDev();
        } else if (empType.trim().equalsIgnoreCase("web")) {
            return new WebDev();
        } else
            return null;
    }
}
