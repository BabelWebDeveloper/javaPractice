package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Przemek",500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
	// write your code here
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score){/*można używać tej samej metody o tej samej nazwie ale z np inną ilością parametrów - unikalne oznaczenie metody*/
        System.out.println("Unamed Player scored " + score + " points.");
        return score * 1000;
    }
}
