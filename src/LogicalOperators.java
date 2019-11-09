public class LogicalOperators {

    public static void main(String[] args) {
        boolean isOld = true;
        boolean isOld2 = false;

        boolean oldResult = isOld || isOld2;

        System.out.println("Is Old Result: " + oldResult);

        boolean isHusbandMillionaire = true;
        boolean isWifeMillionaire = false;

        boolean isChildMillionaire = isHusbandMillionaire || isWifeMillionaire;

        System.out.println("Is child a millionaire " + isChildMillionaire);

        boolean isSunny1 = true;
        boolean isRainny1 = true;

        boolean isRainbow1 = isSunny1 && isRainny1;

        System.out.println("will there will be a rainbow: " + isRainbow1);


         





    }
}
