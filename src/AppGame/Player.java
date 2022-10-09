package AppGame;

public class Player {
    int number;

    public void playNumber() {
        int x = (int) (Math.random() * 10);
        number = x;
    }
}
