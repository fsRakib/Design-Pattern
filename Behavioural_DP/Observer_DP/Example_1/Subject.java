package Behavioural_DP.Observer_DP.Example_1;

interface Subject {
    void subscribe(Observer ob);
    void unsubscribe(Observer ob);

    void notifyChanges();
}