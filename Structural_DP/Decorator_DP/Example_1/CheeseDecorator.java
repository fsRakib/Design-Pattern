package Structural_DP.Decorator_DP.Example_1;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return super.bake() + "Cheese ";
    }

}
