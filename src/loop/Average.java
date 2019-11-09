package loop;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {


        double num = 0;
        double x = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number(n) you want to calculate the average: ");
        int n = sc.nextInt();cd

while (x <= n){
        System.out.println("Enter your mark: " + (int) x);
        num += sc.nextDouble();
        x += 1;
    }
    double avg = (num/n);
    System.out.println("Average: + " + avg);



    }

    }
