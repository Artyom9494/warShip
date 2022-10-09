package SizeDog;

public class MainDog {
    public static void main(String[] args) {
        SizeDog dog1 = new SizeDog();
        dog1.setSize(0);
        dog1.barkDog();
        System.out.println(dog1.getSize());
    }
}
