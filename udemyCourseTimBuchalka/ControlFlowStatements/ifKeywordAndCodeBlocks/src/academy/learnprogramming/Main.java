package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5001)
            System.out.println("Twój wynik to 5000.");
        System.out.println("to jest poza powyższą deklaracją (średnik) - wykona się niezależnie od niej");

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but grather that 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000.");
        } else {
            System.out.println("Got here!");
        }

//

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);/*funkcja zadeklarowana lokalnie - nie można uzyskać do niej dostępu poza tym blokiem kodu*/
            System.out.println("Your final score is: " + finalScore);
        }

//        Challange

        if (gameOver == true) {
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is: " + finalScore);
        }

//        Methods:



    }
}
