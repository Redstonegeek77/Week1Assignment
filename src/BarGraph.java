
import hsa.Console;
import java.awt.Color;
import java.util.Random;

public class BarGraph {

    static Console c;
    static Random r = new Random();
    static float red, green, blue;
    static int heighti;
    static int xloc = 50;

    public static void main(String[] args) {
        c = new Console();

        for (int i = 0; i < 4; i++) {
            c.println("What is the height of rectangle " + (i + 1) + " in cm?");
            heighti = c.readInt();
            int yloc = 490 - heighti;

            red = r.nextFloat();
            green = r.nextFloat();
            blue = r.nextFloat();
            Color col = new Color(red, green, blue);

            c.setColor(col);
            c.fillRect(xloc, yloc, 50, heighti);
            c.drawRect(xloc, yloc, 50, heighti);
            String str = String.valueOf(heighti);
            c.drawString("Height of rect:" + str, xloc + 5, yloc - 10);
            xloc += 100;

        }
    }
}
