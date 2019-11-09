package StringBuilder;

public class stringbuilder1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out .println(sb.capacity());

        StringBuilder sb1 = new StringBuilder("DevX School");
        System.out.println(sb1.capacity());
        System.out.println("");


        StringBuilder sb3 = new StringBuilder();
        sb3.append("Name: ");
        sb3.append("John");
        sb3.append("\nGrade ").append("\"A\" ").append("GPA: ");
        sb3.append(4.0);
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("DevX School");
        sb4.insert(4,"<>");
        System.out.println(sb4);
        sb4.insert(3,"5");
        System.out.println(sb4);






    }


}
