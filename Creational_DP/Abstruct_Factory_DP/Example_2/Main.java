package Creational_DP.Abstruct_Factory_DP.Example_2;

public class Main {
    public static void main(String[] args) {
        Widget widget = WidgetFactory.getWidget(new AndroidWidgetFactory());

        System.out.println(widget.Button() + " , " + widget.ScrollBar());

        Widget widget2 = WidgetFactory.getWidget(new iOSWidgetFactory());

        System.out.println(widget2.Button() + " , " + widget2.ScrollBar());
    }
}
