public class DiagonalStar3 {
    public static void printSquareStar(int number){

        if (number < 5) {
            System.out.println("Invalid Value");
        }

        else {

            for (int q = 0; q < number; q++){

                for (int w = 0; w < number; w++){

                    if (q == 0 /*pozioma linia z góry*/|| w == 0 /*pionowa linia z lewej*/|| q == w/*przekątna left-right*/|| q == number - 1 /*linia dół*/|| w == number - 1 /*linia pionowa z prawej*/ || w == number - (q + 1)/*przekątna right left*/){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }

                }
                System.out.println();
            }

        }

    }
}

//q == number - 1 || w == number - 1 || q == 0 || w == 0 || q == w || w == number - (q + 1)
