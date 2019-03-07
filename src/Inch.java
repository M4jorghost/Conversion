import java.util.Scanner;

public class Inch {

    public static void main(String [] args) {
        int inch;
        double cm;
        final double CM_PER_INCH = 2.54; // one inch is 2.54 cm.

        Scanner in = new Scanner(System.in);

        System.out.print("How many inches? ");
        inch = in.nextInt();
        cm = inch * CM_PER_INCH;
        System.out.println(cm + "cm");
    }
}
