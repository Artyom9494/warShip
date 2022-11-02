package Cars;
import Test.MyArr2;
import Сalculator.CalculatorWto;

public class AppCar {
    public static void main(String[] args) {

        int [][] numberArr = {{12,2,3,4,5,6,6},
                              {0,990,8878,4564}};
        MyArr2 arr2 = new MyArr2();
        arr2.showArr(numberArr);

        System.out.println("XXXXXXXXXXXXXXXXXXXX");

        CalculatorWto infoCar = new CalculatorWto();
        Car audi = new Car("Audi", 002, "Black");
        Lada2109 lada = new Lada2109();
        audi.infoCar();
        audi.startCar();
        lada.startCar();
        audi.setNameModel("BMW");
        audi.infoCar();

        infoCar.carCalculator();
    }
}
