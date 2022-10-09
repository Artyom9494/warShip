package AppGame;

public class Gameplay {
    Player p1;
    Player p2;
    Player p3;

   public void startGame() {
       p1 = new Player();
       p2 = new Player();
       p3 = new Player();

       boolean valueP1 = false;
       boolean valueP2 = false;
       boolean valueP3 = false;

       int targetNumber = (int) (Math.random() * 10);
       System.out.println("Число загадано число 1 до 10))");

       while (true) {
           p1.playNumber();
           System.out.println(p1.number);
           p2.playNumber();
           System.out.println(p2.number);
           p3.playNumber();
           System.out.println(p3.number);

           int myNumber1 = p1.number;
           if (myNumber1 == targetNumber) {
               valueP1 = true;
           }
           int myNumber2 = p2.number;
           if (myNumber2 == targetNumber) {
               valueP2 = true;
           }
           int myNumber3 = p3.number;
           if (myNumber3 == targetNumber) {
               valueP3 = true;
           }
           if (valueP1 || valueP2 || valueP3) {
               System.out.println("Есть победитель ))");
               System.out.println(" Игрок 1 загадал " + myNumber1 + " " + valueP1);
               System.out.println(" Игрок 2 загадал " + myNumber2 + " " + valueP2);
               System.out.println(" Игрок 3 загадал " + myNumber3 + " " + valueP3);
               System.out.println("правильное значение :" + targetNumber);
               break;
           } else {
               System.out.println(" Игроки должны поробовать ещё раз!");
           }
       }

   }
}
