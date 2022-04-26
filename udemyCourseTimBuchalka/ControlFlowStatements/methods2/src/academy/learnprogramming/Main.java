package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
//        Metoda: jej nazwa to main i zawira wszystko w nawiasach klamrowych - cały kod
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
//        MOżna też przypisać utworzone zmienne do innej metody i w niej wykonywać obliczenia:
        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);
    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {/*void - nie wysyłaj żancyh informacji z powrotem*/

        if (gameOver) {/*gameOver jest przekazany już jako true - nie trzeba powtarzać tutaj*/
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is: " + finalScore);
        }
    }

}
