//Napisz metodę statyczną, która jako parametr przyjmie listę liczb całkowitych. Metoda zwróci przekonwertowaną listę liczb całkowitych, dzięki czemu elementy o nieparzystych indeksach listy wejściowej zostaną umieszczone na początku listy, a elementy o indeksach parzystych na końcu listy.
//Example input: [2,6,9,3,1,0,5];
//Output: [6,3,0,2,9,1,5];
public class Main {
    public static void main(String[] args) {
        int[] array = {2,6,9,3,1,0,5};
//        printArray(first(array));
        int[] array2 = {2,3,4,0,1};
        printArray(seccond(array2));
    }

//    liczby o parzystym indeksie idą na koniec szyku, nieparzyste na początek
    public static int[] first(int[] array){
        int [] newArr = new int[array.length];
        for (int i = 0, k = 0, l = array.length - 1; i < array.length; i++){
            if (i % 2 == 0){
                newArr[l] = array[i];
                l--;
            } else {
                newArr[k] = array[i];
                k++;
            }
        }
        array = newArr;
        return array;
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

//    Napisz metodę, która otrzyma jako dane wejściowe tablicę liczb całkowitych i zwróci nową tablicę ze zmienioną kolejnością wartości danych wejściowych. Wartość każdego elementu (o indeksie i) tablicy wejściowej wskazuje na indeks tej samej tablicy wejściowej, pod którą znajduje się wartość N. Wartość N ma być przypisana do i-tego elementu tablicy wyjściowej.
//1) Input: [2,0,1,3]; Output: [1,2,0,3],
//
//2) Input: [7,6,5,4,3,2,1,0]; Output: [0,1,2,3,4,5,6,7],
//
//3) Input: [2,3,4,0,1]; Output: [4,0,1,2,3]

    private static int[] seccond(int[] array){
        int[] newArr = new int[array.length];

        for (int i = 0; i < array.length; i++){
            int value = array[i];
            newArr[i] = array[value];
        }
        return newArr;
    }
}
