package com.company;

public class Main {

    public static void main(String[] args) {
        rectangle(5);
        System.out.println(" ");

        traingle(5);
        System.out.println(" ");
//
//        traingleReverse(5);
//        System.out.println(" ");
//
//        rightSideDownsizeTraingle(5);
//        System.out.println(" ");
//
//        rightSideUpsizeTraingle(5);
//        System.out.println(" ");
//
//        pyramid(5);
//        System.out.println(" ");
//
//        pyramidReverse(5);
//        System.out.println(" ");

        diagonal(10);
        System.out.println(" ");

//        diagonal2(10);
//        System.out.println(" ");
    }

    public static void rectangle(int number){
        for (int i = 0; i < number; i++){
            for (int j = 0; j < number; j++){
                System.out.print("* ");/*drukuje w poziomie*/
            }
            System.out.println("*");/*drukuje w pionie*/
        }
    }

    public static void traingle(int number){/*number = 5*/
        for (int i = 0; i < number; i++){/*drukuje w pionie*/
            for (int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println("*");
        }
    }

    public static void traingleReverse(int number){
        for (int i = 1; i <= number; i++){
            for (int j = number; j > i; j--){
                System.out.print("* ");
            }
            System.out.println("*");
        }
    }

    public static void rightSideDownsizeTraingle(int number){
        for (int i = 0; i < number; i++){/*drukuje w pionie*/
            for (int j = 0; j < i; j++){
                System.out.print("  ");
            }
            for (int k = number; k > i; k--){
                System.out.print("* ");
            }
            System.out.println("  ");
        }
    }

    public static void rightSideUpsizeTraingle(int number){
        for (int i = 1; i <= number; i++){/*drukuje w pionie*/

            for (int j = number; j > i; j--){
                System.out.print("  ");
            }

            for (int k = 0; k < i; k++){
                System.out.print("* ");
            }

            System.out.println(" ");
        }
    }

    public static void pyramid(int number){
        for (int i = 1; i <= number; i++){/*drukuje w pionie*/

            for (int j = number; j > i; j--){
                System.out.print("  ");
            }

            for (int k = 1; k < i; k++){
                System.out.print("* ");
            }

            for (int l = 0; l < i; l++){
                System.out.print("* ");
            }

            System.out.println(" ");
        }
    }

    public static void pyramidReverse(int number){
        for (int i = 1; i <= number; i++){/*drukuje w pionie*/

            for (int j = 1; j < i; j++){
                System.out.print("  ");
            }

            for (int k = number; k > i; k--){
                System.out.print("* ");
            }

            for (int l = number; l >= i; l--){
                System.out.print("* ");
            }

            System.out.println("");
        }
    }

//    _______________________________________________

    public static void diagonal(int number){
        int count = 0;
        for (int i = 1; i < number + 1; i++){

            count++;

//            tutaj przyprostokątna pozioma
            if (count == 1){
                for (int y = number - 1; y > i; y--){
                    System.out.print("# ");
                }
            }

            /*tutaj przyprostokątna pionowa*/
            if (count >= 2){
                System.out.print("% ");
            }


            if (count >= 3){
                for (int r = 0; r < i - 2; r++){
                    System.out.print("$ ");
                }
            }




//            tutaj przeciwprostokątna/ teraz przekątna
//            System.out.println("*");
            for (int t = 1; t <= 1; t++){
                System.out.println("*");
            }

        }
//        tutaj ostatni element przeciwprostokątnej
//        System.out.println("*");

    }

}
