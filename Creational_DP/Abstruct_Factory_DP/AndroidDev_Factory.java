package Creational_DP.Abstruct_Factory_DP;

public class AndroidDev_Factory implements Employee_Abstruct_Factory{

    @Override
    public Employee createEmployee() {
        return new AndroidDev();
    }
    
}
