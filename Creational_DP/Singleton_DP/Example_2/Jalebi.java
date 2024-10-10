package Creational_DP.Singleton_DP.Example_2;

public class Jalebi {
    //eager initialization
    private static Jalebi jalebi= new Jalebi();

    public static Jalebi getJalebi(){
        return jalebi;
    }
}
