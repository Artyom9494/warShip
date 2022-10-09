package SeaBattle;

public class AppSeaBattle {
    public static void main(String[] args) {
        WarShip warShip = new WarShip();
        int [] local = {1,2,3};
        warShip.setLocationCells(local);
        String userGuess2 = "2";
        String resul = warShip.checkYourself(userGuess2);
        String userGuess1 = "1";
        String qq = warShip.checkYourself(userGuess1);
        String userGuess0 = "3";
        String ww = warShip.checkYourself(userGuess0);
    }
}
