package Cars;

public class Lada2109 implements StartCar{
   private String name = "Lada2109";

   @Override
    public void startCar() {
       System.out.println(name + " gir gir gir");
   }
}
