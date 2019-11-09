import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your F degree: ");

        float F = sc.nextFloat();
        float C = (F - 32)*5/9;

        System.out.println("Result in C: " + C);

        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number in inches: ");

        float I = input.nextFloat();
        double M = (I * 0.0254);

        System.out.println("Result in M: " + M);

    }
}
