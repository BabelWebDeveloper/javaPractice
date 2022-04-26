public class Bubble3 {
    public int [] bubbleSort(int [] arr){

        for (int j = 0; j < arr.length; j++){
            for (int i = 0; i < arr.length - 1; i++){
                int memo;
                if (arr[i] > arr[i + 1]){
                    memo = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = memo;
                }
            }
        }
        return arr;
    }

}
