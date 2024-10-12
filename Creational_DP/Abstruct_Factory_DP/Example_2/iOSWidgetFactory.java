package Creational_DP.Abstruct_Factory_DP.Example_2;

public class iOSWidgetFactory implements Widget_Abstruct_Factory {

    @Override
    public Widget createWidgets() {

        return new iOSWidget();
    }

}
