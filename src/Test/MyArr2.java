package Test;

public class MyArr2 {
//    int [][] numberArr = {{12,2,3,4,5,6,6},
//                          {0,990,8878,4564}};

    public void showArr (int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int f = 0; f < arr[i].length; f++) {
                System.out.print(arr[i][f] + " ");
            }
            System.out.println();
        }
    }
}
