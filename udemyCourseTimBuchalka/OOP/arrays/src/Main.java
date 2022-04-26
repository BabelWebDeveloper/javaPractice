public class Main {

    public static void main(String[] args) {

        int [] array1 = {1,2,3,4,5};
//        printIntegers(array1);

        array1 = new int[6];
        array1[0] = 49;
//        printIntegers(array1);

        int [] array2;
        int length = 0;
        length++;
        array2 = new int[length];

        array2[0] = 50;
        System.out.println(array2[0]);

        System.out.println("_________________________________");
//        deklarowanie elementów w szyku sposób 1:
        int [] myIntArray;
        myIntArray = new int[10];
        myIntArray[0] = 50;
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[1]);

        System.out.println();

//        deklarowanie elementów w szyku sposób 2:
        int [] myIntArray2 = new int[10];
        for (int i = 0;  i < myIntArray2.length; i++){
            myIntArray2[i] = i;
            System.out.println(myIntArray2[i]);//wyświetlenie szyku
        }

//        deklarowanie elementów w szyku sposób 3:
        int [] myIntArray3 = {1,2,3,4,5,6,7,8,9};

    }

    public static void printIntegers(int [] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
