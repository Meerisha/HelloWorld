import java.util.Scanner;

public class Calculator {
    public static void main(String [] args) {

        Scanner input=new Scanner(System.in);


        System.out.println("Please enter your number: ");
        int number1 = input.nextInt();


        System.out.println("Please enter your number: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;

        System.out.println ("Your total number is :" + sum);








    }
}
