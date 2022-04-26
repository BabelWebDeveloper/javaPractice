package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        Poniżej do zmiennej highScore została przypisana zmienna finalScore z drugiej metody, oczywiście można było zapisać to normalnie jako finalScore
        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score is: " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score is: " + highScore);

        calculateScore(gameOver, score, levelCompleted, bonus);
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {/*void - nie wysyłaj żadnych informacji nigdzie, aby móc przekazywać info z tej metody należy zmienić void na int*/

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;/*przesyła dane tam gdzie jest wywołany calculateScore*/
        } else {/*przy wywołaniu w metodzie INT, metoda bezwzględnie musi wydać jakieś dane - należy sprawdzić wszystkie możliwości i stworzyć jakiekolwiek dane wyjściowe*/
            return -1;/*w aglorytmach negatywna jedynka oznacza eror*/
        }
    }

}
