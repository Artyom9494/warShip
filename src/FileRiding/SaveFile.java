package FileRiding;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SaveFile {
    public static void main(String[] args) throws FileNotFoundException {
        File person1 = new File("Person");
        PrintWriter pw = new PrintWriter(person1);

        pw.println("Tom");
        pw.println("Lia");
        pw.close();
    }
}
