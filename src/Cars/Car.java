package Cars;

public class Car implements StartCar {
    private String nameModel;
    private int modelNumber;
    private String color;
     Car(String nameModel, int modelNumber, String color) {
            this.nameModel = nameModel;
            this.modelNumber = modelNumber;
            this.color = color;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public void infoCar () {
        System.out.println("Модель " + nameModel + " номер: " + modelNumber + " цвет машины " + color);
    }

    @Override
    public void startCar() {
        System.out.println(nameModel + " Vruum Vruuum");
    }
}
