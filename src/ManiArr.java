public class ManiArr {
    public static void main(String[] args) {
        int [][] maniArr = {{2,4,6,7,8,9,0,9,87,6,4,3,56,6,33,},
                            {2,4,6,6,6,7,},
                            {23,45,67,89}};
        for (int i = 0; i < maniArr.length; i++) {
            for (int w = 0; w < maniArr[i].length; w++) {
                System.out.print(maniArr[i][w] + " ");
            }
            System.out.println();
        }

        String [] [] string = {{"hello","Соус","Ха-ха","Привяю","Пёс","Жиза"},
                               {"Doom","Dark","Tom","Sos","Dog","Live"},
                               {"Конец","Алохо","The End","ПоКа"}};
        for (int i = 0; i < string.length; i++ ) {
            for (int j = 0; j < string[i].length; j++) {
                System.out.print(string[i][j] + " ");
            }
            System.out.println();
        }
    }
}
