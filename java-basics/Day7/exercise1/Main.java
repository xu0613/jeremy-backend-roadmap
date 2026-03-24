package Day7.exercise1;

public class Main {
    public static void main(String[] args) {
        Playable p1 = new MusicPlayer();
        Playable p2 = new VideoPlayer();

        p1.play();
        p2.play();
    }
}
