package Structural_DP.Decorator_DP.Example_1;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new JalepanoDecorator(new CheeseDecorator(new Base_Pizza()));
        System.out.println(pizza.bake());
    }
}
