public class Main {
    public static void main(String[] args) {
        int[] data = new int[]{-5,20,10,3,2,0};
        printArray(data);

        System.out.println();
        mergeSort(data,0, data.length - 1);

        printArray(data);
    }

    public static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println((i+1) + ". " + arr[i]);
        }
    }

    public static void mergeSort(int[] data, int start, int end){
        System.out.println("mergeSort fire up -----");
        if (start < end){//breakpoint (start less (0) but not equal end (1), so length == 2)
            int mid = (start + end) / 2;//create midpoint (index)
            System.out.println("start:" + start + ", end: " + end);
            mergeSort(data,start,mid);//last iternation form 1st branch give start:0, end:1 end-!!! najprawdopodobniej ten merge sort zwraca end
            System.out.println("call stack: start:" + start + ", end: " + end + ", mid: " + mid);
            System.out.println();

            mergeSort(data,mid + 1, end);//give start == 0 start-!!!, end == 1
            System.out.println("call stack2: start:" + start + ", end: " + end + ", mid: " + mid);
            System.out.println();
            
            merge(data,start,mid,end);//firstly make the farrest left branch, in variables - > local we can see actual start mid and end for next method calling
            System.out.println();
        }
    }

    public static void merge(int[] data,int start,int mid,int end){
        System.out.println("merge fire up -----");
//        temp array to avoid modifying ori contents
        int[] temp = new int[end - start + 1];
        System.out.println("temp.length: " + temp.length);

        int i = start, j = mid + 1, k = 0;//tutaj z "i" oraz z "j" dają nam index 0 oraz 1

//        while both sub-array have values, then try and merge them in sorted order
        while (i <= mid && j <= end){
            System.out.println("index i: " + data[i] + ", index j: " + data[j] + ",mid: " + mid + ",end: " + end);
            if (data[i] <= data[j]){
                temp[k] = data[i];
                System.out.println("temp index:" + k + ", is: "+ temp[k]);
                k++;
                i++;
            } else {
                temp[k] = data[j];
                System.out.println("temp index:" + k + ", is: "+ temp[k]);
                k++;
                j++;
            }
        }

//        add rest of the values from the left sub-array
        while (i <= mid){
            temp[k] = data[i];
            System.out.println("temp index:" + k + ", is: "+ temp[k]);
            k++;
            i++;
        }

//        add rest of the values from the right sub-array
        while (j <= end){
            temp[k] = data[j];
            System.out.println("temp index:" + k + ", is: "+ temp[k]);
            k++;
            j++;
        }

        for (i = start; i <= end; i++){
            data[i] = temp[i - start];
        }
    }
}
