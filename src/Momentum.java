
import java.util.Scanner;

public class Momentum {


    public static void main(String[] args) {
        double mass, speed;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the weight of the item in kilograms?: ");
        mass = sc.nextDouble();
        System.out.print("What is the speed of the object in meters per second?: ");
        speed = sc.nextDouble();
        System.out.println("The momentum of this object is: " + String.format("%.0f",mass * speed) + " meters per second");
    }

}
