public class DiagonalStar {
    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            int count = 0;
            int countReverse = number;


            for (int q = 1; q <= number; q++) {

                count++;
                countReverse--;

                if (count >= 2 && count < number) {
                    System.out.print("$ ");
                }

                if (count >= 1 && count <= number / 2) {

                    for (int w = 2; w < count; w++) {
                        System.out.print("* ");
                    }
                    System.out.print(count + " ");

                    for (int e = countReverse; e > count; e--) {
                        System.out.print("% ");
                    }
                    System.out.print(countReverse + " ");

                    for (int r = 0; r < count - 2; r++) {
                        System.out.print("* ");
                    }

                }

                if (count > number / 2 && count <= number) {
                    for (int t = 1; t < countReverse; t++) {
                        System.out.print("* ");
                    }
                    System.out.print(countReverse + " ");

                    for (int y = count - 3; y >= countReverse; y--) {
                        System.out.print("* ");
                    }
                }


                if (count >= 2 && count <= number / 2) { /* TYMCZASOWO / 2 !!!!!*/
                    System.out.print("$ ");
                }


                System.out.println("  ");
            }
        }

    }
}
