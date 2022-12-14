package AppWWW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
    private static final String alphabet = "abcdefg";
    private int gridLenght = 7;
    private int gridsize = 49;
    private int [] grid = new int[gridsize];
    private int comCount = 0;
    public String getUserInput(String promt) {
        String inputLine = null;
        System.out.println(promt + " ");
        try {
            BufferedReader is = new BufferedReader (new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }
    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        String [] alphacoords = new String [comSize];
        String temp = null;
        int [] coords = new int[comSize];
        int attempts = 0;
        boolean success = false;
        int location = 0;

        comCount++;
        int incr = 1;
        if ((comCount % 2) == 1) {
            incr = gridLenght;
        }
        while (!success & attempts++ < 200) {
            location = (int) (Math.random() * gridsize);
            int x = 0;
            success = true;
            while (success && x < comSize) {
                if (grid[location] == 0) {
                    coords[x++] = location;
                    location += incr;
                    if (location >= gridsize) {
                        success = false;
                    }
                    if (x > 0 && (location % gridLenght == 0)) {
                        success = false;
                    }
                }
                else  {
                    success = false;
                }
            }
        }
        int x = 0;
        int row = 0;
        int colum = 0;
        while (x < comSize) {
            grid[coords[x]] =1;
            row = (int) (coords[x] / gridLenght);
            colum = coords[x] % gridLenght;
            temp = String.valueOf(alphabet.charAt(colum));
            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
        }
        return alphaCells;
    }
}
