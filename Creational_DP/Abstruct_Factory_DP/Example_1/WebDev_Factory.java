package Creational_DP.Abstruct_Factory_DP.Example_1;

public class WebDev_Factory implements Employee_Abstruct_Factory {

    @Override
    public Employee createEmployee() {
        return new WebDev();
    }

}
