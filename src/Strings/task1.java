/*package Strings;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        System.out.println("Enter your first text:");
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();

        System.out.println("Enter your second text:");
        String second = input.nextLine();

        boolean check = versionCheck(first, second);
        System.out.println(check);
    }

    public static boolean versionCheck(String str1, String str2) {

        if (str1 != null && !str1.isEmpty()) {
            if (str1.contains(str2)) {
                return true;
            } else {

                str1 = str1.substring(str1.indexOf("version:"));
                System.out.println("current version of the app is " + str1 + "is not " + str2);
                return false;
            }
        }
        System.out.println("String one was null or empty");
        return false;

        public void someMethod() {
            String str1 = "2019-11-11 - INFO version: successfully started Google Adapter App with version: 1.0.4.";
            String str2 = "1.0.5";
            String str3 = "";

        }
    }
}
*/