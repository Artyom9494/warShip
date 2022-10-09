package SizeDog;

public class SizeDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void barkDog () {
        if (size > 60) {
            System.out.println(" ГАВ ГАВ ГАВ");
        } else if (size > 30) {
            System.out.println("Уф Уф Уф");
        } else {
            System.out.println(" тяв тяв тЯв");
        }
    }
}
