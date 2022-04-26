public class Main {

    public static void main(String[] args) {

        int [] someArr = {4,8,4,4,7,3,9};
        sortIntegers(someArr);
    }

    //  JESTEŚMY BLIKSO !!!
    public static void sortIntegers(int [] array){
        int val = array[0];
        int [] sorted = new int[array.length];

        for (int i = 0; i < array.length; i++){//tutaj powinna być zmieniający się array

            if (array[i] > val){
                val = array[i];
            }
        }
        System.out.println(val);
    }

    public static void printIntegers(int [] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}



