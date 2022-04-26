public class Selection {
    public int[] selectionSort(int [] arr){
        for (int i = 0; i < arr.length - 1; i++){//loop through all array
            int minIndex = i;//assigning every next int
            for (int j = i+1; j < arr.length; j++){//starting from i + 1 to the end - 1
                if (arr[j] < arr[minIndex]){//if some element is less than min assign it to min
                    minIndex = j;
                    int memo = arr[i];//saving i element in array
                    arr[i] = arr[minIndex];//assigning element with index with minimum value to i element in array
                    arr[j] = memo;//assigning old i element to (i+1) element (j element)
                }
//                next loop start form second element
            }
        }
        return arr;
    }
}
