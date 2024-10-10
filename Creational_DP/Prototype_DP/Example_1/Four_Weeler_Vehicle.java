package Creational_DP.Prototype_DP.Example_1;

public class Four_Weeler_Vehicle extends Vehicle{
    private boolean automatic;
    private boolean isDiesel;

    public Four_Weeler_Vehicle(String engine, String model, int price, boolean automatic, boolean isDiesel) {
        super(engine, model, price);
        this.automatic = automatic;
        this.isDiesel = isDiesel;
    }

    @Override
    protected Four_Weeler_Vehicle clone() throws CloneNotSupportedException {
        return (Four_Weeler_Vehicle)super.clone();
    }

    
}
