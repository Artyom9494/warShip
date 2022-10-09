package AppWWW;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells (ArrayList<String> loc) {
        this.locationCells =loc;
    }

    public void setName (String n) {
        this.name = n;
    }

    public String checkYourself (String userInput) {
        String result = "МИМО";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "ПОТОПИЛ";
                System.out.println("Вы потопили" + name);
            } else {
                result = "ПОПАЛ";
            }
        }
        return result;
    }
}
