import java.util.Scanner;

public class AverangeStudent {
    public static void main (String[] args){
        Scanner inputheight = new Scanner (System.in);

        System.out.println("Find average height of student");
        double height = inputheight.nextDouble();
        double height1 = inputheight.nextDouble();
        double height2 = inputheight.nextDouble();
        double height3 = inputheight.nextDouble();
        double height4 = inputheight.nextDouble();
        double height5 = inputheight.nextDouble();
        double height6 = inputheight.nextDouble();
        double height7 = inputheight.nextDouble();
        double height8 = inputheight.nextDouble();
        double height9 = inputheight.nextDouble();
        double height10 = inputheight.nextDouble();

        double sumOfHeight = 0;
        sumOfHeight += height + height2 + height3 + height4 + height5 +
                height6 + height7 + height8 + height9 + height10;

        System.out.println(sumOfHeight /15 + "The average of student height");


    }
}
