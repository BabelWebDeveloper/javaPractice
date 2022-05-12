import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isRunning = true;
        showMenu();

        while (isRunning){

            int userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice){
                case  1 -> System.out.println("You choose one!");
                case  2 -> System.out.println("You choose two!");
                case  3 -> System.out.println("You choose three!");
                case  4 -> showMenu();
                case  5 -> isRunning = false;
            }
        }
    }

    private static void showMenu(){
        System.out.println("=====================");
        System.out.println("Type 1 to choose 1");
        System.out.println("Type 2 to choose 2");
        System.out.println("Type 3 to choose 3");
        System.out.println("Type 4 to show menu");
        System.out.println("Type 5 to quit");
        System.out.println("=====================");
    }
}
