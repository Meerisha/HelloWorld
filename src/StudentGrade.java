import java.util.Scanner;

public class StudentGrade {
    //2)Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores)
    // and determine the grade based on the following rules:
    //-if the average score >=90% =>grade=A
    //-if the average score >= 70% and <90% => grade=B
    //-if the average score>=50% and <70% =>grade=C
    //-if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade is B.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your quiz score: ");
        int quiz = input.nextInt();

        System.out.println("Please enter your mid-term score: ");
        int midTerm = input.nextInt();

        System.out.println("Please enter your final exam score: ");
        int finalScore = input.nextInt();

        int average = (quiz + midTerm + finalScore)/3;

        if (average >= 90) {
            System.out.println("Your grade is :'A'");

        }
        if (average >= 70 && average < 90) {
            System.out.println("Your grade is : 'B'");

        }
        if (average >= 50 && average < 70) {
            System.out.println("Your grade is : 'C'");


        }


    }
}
