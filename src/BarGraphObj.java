
import hsa.Console;
import java.awt.Color;
import java.util.Random;

public class BarGraphObj {

    static Console c;
    int xloc = 50, heighti, yloc;
    Color col;
    Random r = new Random();
    float red, green, blue;

    public void drawRect(Console c) {
        for (int i = 0; i < 4; i++) {
            c.print("What is the height of rectangle " + (i + 1) + " in cm?  ");
            heighti = c.readInt();

            yloc = 490 - heighti;

            getColour();

            c.setColor(col);
            c.fillRect(xloc, yloc, 50, heighti);
            c.drawRect(xloc, yloc, 50, heighti);
            String str = String.valueOf(heighti);
            c.drawString("Height of rect:" + str, xloc + 5, yloc - 10);
            xloc += 100;

        }
    }

    public Color getColour() {
        red = r.nextFloat();
        green = r.nextFloat();
        blue = r.nextFloat();
        col = new Color(red, green, blue);
        return col;
    }

    public static void main(String[] args) {
        c = new Console();
        BarGraphObj rect = new BarGraphObj();
        rect.drawRect(c);

    }
}
