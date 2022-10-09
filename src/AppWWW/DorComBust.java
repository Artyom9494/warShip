package AppWWW;

import java.util.ArrayList;

public class DorComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        System.out.println("Вы потопили три сайта");
        System.out.println("Pets.com eToys.com Go2.com");
        System.out.println("Попытайтесь потомит их за наименьшее количество ходов");

        for (DotCom dotComToSet: dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }
    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделай ход");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Мимо";
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);

            if (result.equals("Попал")) {
                break;
            }
            if (result.equals("Потопил")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    private void finishGame() {
        System.out.println("Все сайты ужли но дно))");
        if (numOfGuesses <= 18) {
            System.out.println("У вас ушло всего " + numOfGuesses + " ходов");
        } else {
            System.out.println("Это у вас отняло много времени и " + numOfGuesses + " ходов");
        }
    }

    public static void main(String[] args) {
        DorComBust game = new DorComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
