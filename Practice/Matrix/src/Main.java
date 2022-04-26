public class Main {
    public static void main(String[] args) {

//        Initialization first way:
        int [][] lotteryCard = {
                {20,15,7},
                {8,7,19},
                {7,13,47}};

//        Initialization second way:
        int[][] lotteryCard2 = new int[3][3];
//      [row][column]
        lotteryCard2[0][0] = 20;
        lotteryCard2[0][1] = 15;
        lotteryCard2[0][2] = 7;
        lotteryCard2[1][0] = 8;
        lotteryCard2[1][1] = 7;
        lotteryCard2[1][2] = 19;
        lotteryCard2[2][0] = 7;
        lotteryCard2[2][1] = 13;
        lotteryCard2[2][1] = 41;

//        printMatrix(lotteryCard);

        int[][] matrix = {
                {11,2,4},
                {4,5,6},
                {10,8,-12}
        };

        diagonalDifference(matrix);
    }

    private static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            System.out.println((i + 1) + " row:");
            for (int j = 0; j < matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }
        }
    }

    private static void diagonalDifference(int[][] matrix){
        int primary = 0;
        int secondary = 0;
        for(int i = 0, j = matrix.length - 1; i < matrix.length; i++,j--){
            primary += matrix[i][i];
            secondary += matrix[i][j];
//            System.out.println(matrix[i][j]);
        }
        System.out.println(Math.abs(primary - secondary));
    }
}
