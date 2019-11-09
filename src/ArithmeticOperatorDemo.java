import java.util.Scanner;

public class ArithmeticOperatorDemo {

    public static void main(String args[]) {

        Scanner input = new Scanner (System.in);

        System.out.println("Please enter your first number: ");
        int num1;

        num1 = input.nextInt();

        System.out.println("Your first number is: " + num1);

        System.out.println("Please enter your second number");
        int num2 = input.nextInt();

        System.out.println("Your second number is ");


        System.out.println("num1 + num2: " + (num1 + num2) );
        System.out.println("num1 - num2: " + (num1 - num2) );
        System.out.println("num1 * num2: " + (num1 * num2) );
        System.out.println("num1 / num2: " + (num1 / num2) );
        System.out.println("num1 % num2: " + (num1 % num2) );

    }
}