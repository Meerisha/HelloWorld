package Switch;

import java.util.Scanner;

public class CollegeProgress {

        //Basic Algebra --> CS --->Economics
        //Advance Algebra --> Economics
        //Trigonometry --> CS
        // Statistic -->Economic
        //Calculus --> CS
        //Calculus 2 -->CS

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Which year in college? ");
        int year = sc.nextInt();

        System.out.println("What is your major?");
        String major = sc.next();

        String course;
        switch (major) {
            case "CS":
                switch (year){
                    case 1:
                        course = "Basic Algebra";
                        break;
                    case 2:
                        course = "Advance Algebra";

                        break;
                    case 3 :
                        course = "Trigonometry";
                        break;
                    case 4:
                        course = "Calc";
                        break;
                    case 5:
                        course = "Calc 2";
                        break;

                    default:
                        course = "You are either graduated or haven't started";
                        break;

                }
                break;

            case "Economics":
                switch (year){
                    case 1:
                        course = "Basic Algebra";
                        break;
                    case 2:
                        course = "Advance Algebra";
                        break;
                    case 3 :
                        course = "Trigonometry";
                        break;
                    case 4:
                        course = "Calc";
                        break;
                    case 5:
                        course = "Calc 2";
                        break;

                    default:
                        course = "You are either graduated or haven't started";
                        break;

                }

            default:
                course = "We don't offer " + major + " in DevX school yet!";
                break;

        }
System.out.println("In year number " + year + " for major " + major );
        System.out.println("Course info: " + course);

switch (year){

    case 1:
        switch (major){
            case "CS":
            case "Economics":
                course = "Basic Algebra";
                break;
            default:
                course = "We don't the " + major + "major yet";
                break;
        }
        break;

    case 2:
        switch (major){
            case "CS":
            case "Economics":
                course = "Advance Algebra";
                break;
            default:
                course = "We don't the " + major + "major yet";
                break;
        }
        break;

    case 3:
        switch (major){
            case "CS":
                course = "Trigonometry";
                break;
            case "Economics":
                course = "Statistics";
                break;
            default:
                course = "We don't the " + major + "major yet";
                break;
        }
        break;
    case 4:
        switch (major){
            case "CS":
                course = "Calculus 1";
                break;
            case "Economics":
                course = "You are done with math";
                break;
            default:
                course = "We don't the " + major + "major yet";
                break;
        }
        break;
    case 5:
        switch (major){
            case "CS":
                course = "Calculus 2";
                break;
            case "Economics":
                course = "You are done with math";
                break;
            default:
                course = "We don't the " + major + "major yet";
                break;
        }
        break;
    default:
}
System.out.println("In year number " + year + " for major: " + major);
System.out.println("Course Info: " + course);
    }

}
