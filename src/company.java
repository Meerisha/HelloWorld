import java.util.Scanner;

public class company {

    public static void main(String[] args) {
        String product = "coke";

        double price = 1.10;
        double change;
        int bill;
        int quarters, dimes, nickels, pennies;


        Scanner in = new Scanner (System.in);
        System.out.println("Please enter your bill " + "for coke price is! " + price);

        bill = in.nextInt ();
        change = bill - price;
        int changeCent = (int) change *100;
        System.out.println ("Your change is " + changeCent);

        quarters = changeCent/25; //3 how many quarters
        changeCent %= 25; //15
        dimes = changeCent/10; //1 how many dimes
        changeCent %= 10; //5
        nickels = changeCent/5;
        pennies = changeCent%= 5;


        System.out.println("Your change is ");
        System.out.println(quarters + "quarters ");
        System.out.println(dimes +"dimes ");
        System.out.println(pennies + "pennies");


    }
}
