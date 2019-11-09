import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

        Scanner inputName = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String yourName = inputName.next();
        System.out.println ("Your name is: " + yourName);

        System.out.println("Please enter your last name: ");
        String yourLastName = inputName.next();
        System.out.println ("Your last name is: " + yourLastName);

        System.out.println("Please enter your phone number: ");
        String yourPhoneNumber = inputName.next();
        System.out.println ("Your phone number is: " + yourPhoneNumber);

        System.out.println("Please enter your email: ");
        String yourEmail = inputName.next();
        System.out.println ("Your email is: " + yourEmail);

        System.out.println("Please enter your city: ");
        String yourCity = inputName.next();
        System.out.println ("Your city is: " + yourCity);


    }
}
