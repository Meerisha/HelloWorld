import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Scanner sc = new Scanner(System.in);
        int answer1;
        int answer2;
        int answer3;
        System.out.println("Are you ready for the quiz?");

        String response = input.nextLine();
        System.out.println("Okay here it comes");

        System.out.println();
        System.out.println("Q1: What is the capital of Alaska? ");
        System.out.println("\t 1.Melbourne");
        System.out.println("\t 2.Anchorage");
        System.out.println("\t 3.Juneau");

        answer1=input.nextInt();
        int score=0;

        if (answer1==3) {
            System.out.println("That's right!");
            score++;
        }else {
                System.out.println("Sorry, Juneau is the right answer! Try again");
        }



System.out.println();
System.out.println("Q2: Can you store the value \"cat\" in a variable of type int?");
        System.out.println("\t1)yes");
        System.out.println("\t2)no");

        answer2 = input.nextInt();
        if(answer2==2) {
            System.out.println("That's right!");
            System.out.println("That's right!");
            score++;
        }else {
            System.out.println("Sorry, \"cat\" is a string data type");
        }
            System.out.println("What is the result of 9+6/3?");
            System.out.println("\t1) 5");
            System.out.println("\t2) 11");
            System.out.println("\t3) 15/3");

            answer3=input.nextInt();
            if(answer3==2) {
                System.out.println("That's right!");
                score++;
            }else {
                System.out.println("Sorry, number2 is the right answer!");
            }
            System.out.println("Congrats! Your score is " + score);
            }

        }


