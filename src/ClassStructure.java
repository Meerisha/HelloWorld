public class ClassStructure {
    public static void main(String args[]) {
        System.out.println("This is Class Structure topic of Java!!!");
    }
}

class SecondClass {

    public static void main (String args[]) {
        ClassStructure.main (new String[5]);
    }
}

class Bottle {

    String labelColor = "blue";
    int volume = 16;

}