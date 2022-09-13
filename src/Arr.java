public class Arr {
    public static void main(String[] args) {
        int numb = 10;
        //Массив созданый без инициализации данных ДЖАВА им по дефолту проставляет нули
        int [] arrNum = new int [10];
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = i;
            //System.out.println(arrNum[3]);
        }
        System.out.println(arrNum.length);
        //массив в котором мы знаем все значения ЧИСЛОВОЙ
        int [] number2 = {1,2,5,155,5,8,8,7,};
        System.out.println(number2.length);
        System.out.println(number2[3]);
        for (int c:number2) {
            System.out.println(c);
        }

        //массив в котором мы знаем все значения из СТРОК
        String [] arrString = {"wow","sos","doom"};
        System.out.println(arrString[2]);

        //это как форыч Стринг это тип данных Х это аргумент после двоетеочия указывается массив которому мы обращаеися
        for (String x:arrString) {
            System.out.println(x);
        }
    }
}
