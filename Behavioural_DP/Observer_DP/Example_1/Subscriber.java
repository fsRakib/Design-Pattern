package Behavioural_DP.Observer_DP.Example_1;

public class Subscriber implements Observer {

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notified() {
        System.out.println("Hello " + this.name +",  a new video upload : notification");
    }

}
