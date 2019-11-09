import java.util.Scanner;

public class twoIntegers {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please inter your first Integer: ");
        int a =  sc.nextInt();

        System.out.println("Please inter your second Integer: ");
        int b =  sc.nextInt();

        System.out.println("Sum of two integers: " + (a + b));
        System.out.println("Difference of two integers: " + (a - b));
        System.out.println("Product of two integers: " + (a * b));
        System.out.println("Average of two integers: " + (a+b)/2);
        System.out.println("Distance of two integers: " + (a-b));
        System.out.println("Max integer: " + b);
        System.out.println("Min integer: " + a );
    }
}
