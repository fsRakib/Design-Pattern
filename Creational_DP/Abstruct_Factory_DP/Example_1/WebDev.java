package Creational_DP.Abstruct_Factory_DP.Example_1;

public class WebDev implements Employee {

    @Override
    public String name() {
        return "I am Web Developer";
    }

    @Override
    public int salary() {
        return 40000;
    }

}
