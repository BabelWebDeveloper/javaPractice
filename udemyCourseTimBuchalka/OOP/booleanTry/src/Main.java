import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a;
        do {
            System.out.print("Write something here: ");
            a = scan.nextLine();
        } while (!(a.equals("yes") || a.equals("no")));

        // Display the correct input
        System.out.println("Finally, you have entered the correct value, which is " + a);
    }
}
