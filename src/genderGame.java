import java.util.Scanner;

public class genderGame {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.println("What is your first name: ");
        String firstName = sc.nextLine();


        System.out.println("What is your last name: ");
        String lastName = sc.nextLine();


        System.out.println("What is your age: ");
        int age = sc.nextInt();

        //System.out.println("Are you married, " + firstName + "? ");
        //   1) yes
        //   2) no

        //System.out.println("\t1)yes");
        //System.out.println("\t2)no");​
       // answer=input.nextInt();
        //if(answer==1
        //if(answer==2

        System.out.println("What is your gender (M or F): ");
        char gender = sc.next().charAt(0);

        if (gender =='F'){

            if (age < 20){
                System.out.println("Then I shall call you" + firstName + " " + lastName );
            } else {
                System.out.println("Are you married, " + firstName + "? ");

                char married = sc.next().charAt(0);
                if (married == 'Y'){
                System.out.println("Then I shall call you Mrs " + firstName + " " + lastName);
            } else{
                    System.out.println("Then I shall call you Ms " + firstName + " " + lastName);
            }

            }
        } else if (gender == 'M'){
            if (age < 20){
                System.out.println("Then I shall call you" + firstName + " " + lastName );
            } else {
                System.out.println("Then I shall call you Mr " + firstName + " " + lastName );
            }
        }

    }

}
