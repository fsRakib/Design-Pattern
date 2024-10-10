package Behavioural_DP.Observer_DP.Example_1;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();
        Subscriber aman = new Subscriber("Aman");
        Subscriber rakib = new Subscriber("Rakib");

        youtubeChannel.subscribe(aman);
        youtubeChannel.subscribe(rakib);
        youtubeChannel.notifyChanges();
    }
}
