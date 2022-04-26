public class Main {
    public static void main(String[] args) {
        int [] arr = {3,2,1,4,5,6};
//        Selection is efficient for smaller list but inefficient for larger lists
        Selection selection = new Selection();
        printArr(selection.selectionSort(arr));
    }

    public static void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
