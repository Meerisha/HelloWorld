package Switch;

import java.util.Scanner;

public class YearSeasons {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your month number");
        int monthNum = sc.nextInt();


String month;
        switch (monthNum) {
            case 1:

                month = "January";
                break;

            case 2:

                month = "February";
                break;

            case 3:

                month = "March";
                break;

            case 4:
                ;
                month = "April";
                break;

            case 5:

                month = "May";
                break;

            case 6:
                month = "June";
                break;

            case 7:
                month = "July";
                break;

            case 8:
                month = "August";
                break;

            case 9:
                month = "September";
                break;

            case 10:
                month = "October";
                break;

            case 11:
                month = "November";
                break;

            case 12:
                month = "December";
                break;

            default:
                month = "Invalid month is entered";
                break;

        }


        switch (month) {
            case "January":
            case "February":
            case "December":
                System.out.println("Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;
            case "June":
            case "August":
            case "July":
                System.out.println("Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Autumn");
                break;
        }
    }
}