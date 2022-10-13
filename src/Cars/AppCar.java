package Cars;

public class AppCar {
    public static void main(String[] args) {
        Car audi = new Car("Audi", 002, "Black");
        Lada2109 lada = new Lada2109();
        audi.infoCar();
        audi.startCar();
        lada.startCar();
        audi.setNameModel("BMW");
        audi.infoCar();
        audi.setNameModel("Reno");
    }
}
