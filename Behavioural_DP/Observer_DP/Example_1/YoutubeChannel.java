package Behavioural_DP.Observer_DP.Example_1;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {
    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void notifyChanges() {
        for (Observer ob : this.subscribers) {
            ob.notified();
        }
    }

    @Override
    public void subscribe(Observer ob) {
        this.subscribers.add(ob);
    }

    @Override
    public void unsubscribe(Observer ob) {
        this.subscribers.remove(ob);
    }

}
