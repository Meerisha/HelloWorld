/*package methods;

import java.util.Scanner;

public class person1 {

//create the program that will ask user to enter month of birth and year of birth
//then create the separate method to count age (Hint: takes year of birth as a parameter, and return int age)
//then create the separate method to check the season when he was born(Hint: takes month of birth as a parameter,
// and return String Season)
//then in main method grate the logic that will check if user is teenager or adult or kid and print
//this person is (teenager/kid/adult) and age is (how old he is) he was born in (Summer/Winter/Spring/Fall)


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your month of birth: ");
        int month = sc.nextInt();

        System.out.println("Please enter your year of birth: ");
        int year = sc.nextInt();
        int age = age(year);
        String season = season(month);
        System.out.println("Testing " + season + " " + age);
        if (age >= 0 && age <13) {
            System.out.println("This person is a kid " + " and age is " + age + " he/she was born in " + season);
        } else if(age >= 13 && age < 20 ){
            System.out.println("This person is a teenager " + " and age is " + age + " he/she was born in " + season);
            { else {
                System.out.println("This person is an adult " + " and age is " + age + " he/she was born in " + season);


        }


    }

    public static int age(int inputYear){
        int age = 2019 - inputYear;
        if(age<0){
            System.out.println("Invalid")
        }
        return age;
    }

    public static String season(int month){
        String season;
        // Spring 3,4,5
        if(month==3 | month==4 || month == 5 ){
            // if we have | it will check both sides
            // if we have || it will check first if first is true it will not check the second one
            season = "Spring";
            return season;
            //6,7,8
        } else if(month>=6 && month <=8) {
            season = "Summer";
            return season;
        }
        return null;
    }

    }*/