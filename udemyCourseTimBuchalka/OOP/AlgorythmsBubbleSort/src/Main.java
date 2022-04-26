public class Main {
    public static void main(String[] args) {
        int [] arr = {5,2,1,6};
        Bubble bubble = new Bubble();
        printArr(bubble.bubbleSort(arr));
    }

    public static void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
