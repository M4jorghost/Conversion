public class Newline {

    public static void newLine() {
        System.out.println();
    }


    public static void threeLine() {
        newLine();
        newLine();
        newLine();
    }

    public static void printTwice(String s) {
        System.out.println(s);
        System.out.println(s);
    }

    public static void printTime(int hour, int minute) {
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
    }

    public static void main(String[] args) {

        int hour = 2;
        int minute= 40;

        System.out.println("I love Coding.");
        threeLine();
        System.out.println("I will keep Coding.");
        printTwice("I love Myself");
        printTime(hour,minute);
        printTime(hour + 1, 59);
        System.out.println(hour + ":" + minute);
    }

}
