public class DataType {
    public static void main(String args[]) {

        //to add a text with variable value + sign and variable

        /* Byte is a data type, which stores whole numbers from -128 to 127
        varialble is a data type that
         */

        byte weight = 55;

        System.out.println("My weight is " + weight);


        //Stores whole numbers from -32,768 to 32,767
        short camryPrice = 18000;

        System.out.println("I bought the camry is " + camryPrice);


        //Stores whole numbers from -2,147,483,648 to 2,147,483,647
        int salary = 125000;

        System.out.println("My annual salary is " + salary);

        //Stores whole numbers from -+9,223,372,072,036,854,775,808
        long chinaPopulation = 1500000000l;

        System.out.println("Chinas population is " + chinaPopulation);

        float gasPrice = 3.309f;
        System.out.println("Gas price is " + gasPrice);

        double stockPrices = 134.000083;
        System.out.println("Stock for Google is " + stockPrices);

        boolean isJavaFun = true;
        boolean isFishTasty = true;
        boolean isWallOrange = false;

        System.out.println("Is Java fun for you? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);
        System.out.println("Is Devx School wall orange color? " + isWallOrange);




    char myFirstNameInitial = 'A';
    char lastLetterInAlphabet = 'Z';
    char space = ' ';
    char tilde = '§';
    char percentage = '%';
    char doubleQuote = '"';
    char caret = '^';
    char pipe = '|';


                System.out.println(myFirstNameInitial + " " + lastLetterInAlphabet + " " + space + tilde);
                System.out.println(percentage + " " + " " + doubleQuote + " " + caret);



                String myFullName = "Meerim Samakova";
                System.out.println("My Name is " + myFullName);

}
}
