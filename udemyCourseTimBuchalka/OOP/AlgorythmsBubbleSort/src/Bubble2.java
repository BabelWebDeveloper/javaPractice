public class Bubble2{
    public int [] bubbleSort(int [] arr){
        boolean flag = true;
        while (flag){
            flag = false;
            for (int j = 0; j < arr.length - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
        }
        return arr;
    }
}