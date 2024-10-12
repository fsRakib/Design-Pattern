package Creational_DP.Abstruct_Factory_DP.Example_2;

public class WidgetFactory {
    public static Widget getWidget(Widget_Abstruct_Factory factory) {
        return factory.createWidgets();
    }
}
