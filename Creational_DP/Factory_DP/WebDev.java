package Creational_DP.Factory_DP;

public class WebDev implements Employee {

    @Override
    public int salary() {
        System.out.println("Getting Web Developer salary");
        return 40000;
    }

}
