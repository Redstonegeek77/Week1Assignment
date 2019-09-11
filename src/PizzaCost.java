
import hsa.Console;
import java.util.Scanner;

public class PizzaCost {

    static Console c;

    public static void main(String[] args) {
        double labor = 1.5, utility = 0.75, diameter, toppings, totalcost;
        double toppingprice = 0.75, baseIng = 0.5;
        Scanner sc = new Scanner(System.in);
        totalcost = labor + utility;
        System.out.println("What is diameter of pizza in inches?");
        diameter = sc.nextDouble();
        totalcost += (diameter * baseIng);
        System.out.println("How many toppings are you going to get on pizza?");
        toppings = sc.nextDouble();
        totalcost += (toppings * toppingprice);
        System.out.println("Your total cost for this pizza is: "
                + "$" + totalcost);

    }

}
