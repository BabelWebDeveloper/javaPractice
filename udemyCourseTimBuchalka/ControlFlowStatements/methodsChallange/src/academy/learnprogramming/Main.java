package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
//        Metoda: jej nazwa to main i zawira wszystko w nawiasach klamrowych - cały kod
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        calculateScore(true, 800, 5, 100);
//        calculateScore(true,10000,8,200);


        int highScores = calculateHighScorePosition(1500);
        displayHighScorePosition(true,"Przemek",highScores);
        highScores = calculateHighScorePosition(900);
        displayHighScorePosition(true,"Przemek2",highScores);
        highScores = calculateHighScorePosition(400);
        displayHighScorePosition(true,"Przemek3",highScores);
        highScores = calculateHighScorePosition(50);
        displayHighScorePosition(true,"Przemek4",highScores);


    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is: " + finalScore);
        }
    }

    public static void displayHighScorePosition(boolean gameOver, String playerName, int highScorePosition) {
        if (gameOver) {
            System.out.println(playerName + " managed to get into position " + highScorePosition);
        }
    }

    public static int calculateHighScorePosition(int score){
        if (score > 1000) {
            return 1;
        } else if ((score > 500) && (score < 1000)) {
            return 2;
        } else if ((score > 100) && (score < 500)) {
            return 3;
        } else {
            return 4;
        }
    }

}
