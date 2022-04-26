import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int myIntVal = 10;
//        int myIntVal2 = myIntVal;
//
//        System.out.println(myIntVal);
//        System.out.println(myIntVal2);
//
//        myIntVal2++;
//
//        System.out.println(myIntVal);
//        System.out.println(myIntVal2);

        int[] myArray = {1,3,5,7,9};
        reverse(myArray);
    }

    private static void reverse(int[] array){
        int memo;
        System.out.println("Array = " + Arrays.toString(array));
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++){
            memo = array[i];//tutaj zbiera ori values do połowy długości szyku
            array[i] = array[j - i];//tutaj przypisuje values do połowy długości szyku
            array[j - i] = memo;//tutaj przypisuje drugą połowę szyku do przypisanych wcześniej wartości z pierwszej połowy
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
