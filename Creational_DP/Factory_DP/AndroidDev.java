package Creational_DP.Factory_DP;

public class AndroidDev implements Employee{

    @Override
    public int salary() {
      System.out.println("Getting Android Developer salary");
        return 50000;
    }
    
}
