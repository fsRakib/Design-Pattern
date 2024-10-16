package Behavioural_DP.State_DP.Example_1;

public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {

        return "Start state";
    }

}
