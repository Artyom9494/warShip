public class Random {
    public static void main(String[] args) {
        String[] wordLislOne = {"hello","Соус","Ха-ха","Привяю","Пёс","Жиза"};
        String[] wordLislTwo = {"Doom","Dark","Tom","Sos","Dog","Live"};
        String[] wordLislThree = {"Конец","Алохо","The End","ПоКа"};

        int oneLength = wordLislOne.length;
        int twoLength = wordLislTwo.length;
        int threelength = wordLislThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threelength);

        String phrase = wordLislOne[rand1] + " " + wordLislTwo[rand2] + " " + wordLislThree[rand3];

        System.out.println("Вот мой ответ " + phrase);
    }
}
