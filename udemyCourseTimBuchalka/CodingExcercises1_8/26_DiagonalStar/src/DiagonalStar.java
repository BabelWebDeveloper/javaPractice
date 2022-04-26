public class DiagonalStar {
    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
        } else {
            for (int j = 1; j <= number; j++){
                for (int i = 1; i <= number; i++){
                    if (j == number || j == 1 || i == number || i == 1 || j == i || j == number - i + 1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }
    }
}
