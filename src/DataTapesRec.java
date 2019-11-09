public class DataTapesRec {
    public static void main (String args[]) {

        byte chicagoSpeedLimit = 120;
        byte newYorkSpeedLimit = 80;


        System.out.println ("Chicago Speed Limit is " + chicagoSpeedLimit);
        System.out.println ("New York Speed Limit is " + newYorkSpeedLimit);

        int youtubeViews = 100000, nambaViews = 1500000;

        System.out.println(youtubeViews + " " + nambaViews);
        System.out.println("Youtube views: " + youtubeViews);


        float whiteRainRating = 10.0f, subtleArtRating = 7.9f, elonMuskRating = 9.9f;

        System.out.println("White Rain Composition Rating is : " + whiteRainRating);
        System.out.println("Subtle Art of not giving a fff rating is " + subtleArtRating);
        System.out.println("Elon Musk Biography rating is " + elonMuskRating);


        long chinaPopulation = 15000000000l;


        int chinaPopulationInt = 150000000;
        int indiaPopulation = chinaPopulationInt;

        byte devXStudentCount = 25;
        short jobOpeningsForSoftwareEngineers = 500;

        int devXStudentCountInt = devXStudentCount;

        //smaller dataTypes cannot hold larger ones, despite the the values are in ainvalid range
        //byte jobOpeningsForSoftwareEngineers = jobOpeningsForSoftwareEngineers


        float largestDecimalPointForFloat = 0.999999999f;
        float nextDecimalPointCheck = 15.1111111111111f;  //15.111111
        float roundDecimalPointCheck = 22.5634567f;  //22.563457
        float ifWholeNumberIsMoreThanInt = 2223445565.12f;  //2.2234455E9



        System.out.println(largestDecimalPointForFloat);
        System.out.println(nextDecimalPointCheck);
        System.out.println(roundDecimalPointCheck);
        System.out.println(ifWholeNumberIsMoreThanInt);

        double largestDecimalPointForDouble = 0.999999999999999999f;  //1.0
        double nextDecimalPointCheckDouble = 15.111111111111111f;  //15.111111
        double nextDecimalPointCheckDouble2 = 15.617111711111111f;


        System.out.println( );
        System.out.println(largestDecimalPointForDouble);
        System.out.println(nextDecimalPointCheck);
        System.out.println(nextDecimalPointCheckDouble2);

        double doubleHolder = 9.112;
        float floatHolder = 8.84f;
        long longNumberHolder = 512424l;
        double doubleForLong = longNumberHolder;

        // int intergerHolder = doubleHolder; -> incompatible types;
        // int intergerHolder = floatHolder; -> incompatible types;

        int integerHolder = 600000;
        double doubleForInteger = integerHolder;
        System.out.println(doubleForInteger); // 6000000.0
        System.out.println(longNumberHolder);

        byte byteHolder = 127;

        System.out.println(byteHolder);

        int integerForFloat = 12;
        float floatForInt = integerForFloat;

        System.out.println(floatForInt); // 12



        char charsHolder = 25;
        double doubleForChars = charsHolder;

        System.out.println(charsHolder);
        System.out.println(doubleForChars); //25.0 chars can be assigned to any data type.
        // Decimal number from ACII will be use


        String str = "Hello World!!!";

        System.out.println (str);

        // double doubleForString = str; String can only be assigned to string;




















    }
}
