package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
//        Metoda: jej nazwa to main i zawira wszystko w nawiasach klamrowych - cały kod
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        w tej metodzie załóżmy że np pobieramy z gry poniższe wartości:
        calculateScore(true, 800, 5, 100);
//        zamiast tworzyć wewnątrz metody kolejne deklaracje możemy użyć stworzonej metody do obliczenia koljenych wyników w grze
        calculateScore(true,10000,8,200);

//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        if (gameOver == true) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score is: " + finalScore);
//        }
    }

//    nie można utworzyć nowej metody wenątz innej
//    nowa metoda:
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {/*przekazujemy parametry żeby ich nie tworzyć od nowa wewnątrz nowej metody*/
//        boolean gameOver = true;
//        int score = 5000;
//        int levelCompleted = 5;
//        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);/*funkcja zadeklarowana lokalnie - nie można uzyskać do niej dostępu poza tym blokiem kodu*/
            System.out.println("Your final score is: " + finalScore);
        }
    }

}
