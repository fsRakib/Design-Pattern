package Structural_DP.Decorator_DP.Example_1;

public class JalepanoDecorator extends PizzaDecorator {

    public JalepanoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return super.bake() + "Jalepano ";
    }

}
