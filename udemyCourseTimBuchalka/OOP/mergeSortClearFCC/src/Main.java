public class Main {
    public static void main(String[] args) {
        int[] data = new int[]{4,1,3,2,0,-1,7,10,9,20};
        printArray(data);

        System.out.println();
        mergeSort(data,0,data.length - 1);

        printArray(data);
    }

    public static void printArray(int [] arr){
        System.out.println("---PRINT ARRAY---");
        for (int i = 0; i < arr.length; i++){
            System.out.println("index: " + i + "is: " + arr[i]);
        }
        System.out.println("---PRINT ARRAY---");
    }

    public static void mergeSort(int[] data, int start, int end){
        System.out.println("mergeSort fire up -----");
        if (start < end){
            int mid = (start + end) / 2;

            System.out.println("start:" + start + ", end: " + end);
            mergeSort(data,start,mid);//ostatni wezwany merge sort deklaruje start = 0 i end = 0 (jeszcze nie jest sprawdzony warunek) program przechodzi do następnych instrukcji

            System.out.println("Call back: start: " + start + ", mid: " + mid + ", end: " + end);
            System.out.println();

            mergeSort(data,mid + 1, end);//za każdym razem gdy zostanie pobrany "lewy" call stock to po ukończeniu wszystkich lewych gałęzi odpala się prawy call stock

            // System.out.println("RIGHT call stack : start: " + start + ", end: " + end);//tutaj raczej nie ma prawy lewy call stack tylko wszystko idzie z lewego czyli z funkcji która jest pierwsza w rekurencji
            System.out.println();

            // System.out.println("data for merge - start: " + start + " mid: " + mid + " end: " + end);//dane do merge pobrane z call stacka lewego, mid najprawdopodobniej też się zapisuje w call stacku
            merge(data,start,mid,end);
            System.out.println();
        }
    }

    public static void merge(int[] data,int start,int mid,int end){
        System.out.println("merge fire up -----");
        int[] temp = new int[end - start + 1];
        System.out.println("temp.length: " + temp.length);

        int i = start, j = mid + 1, k = 0;
        printArray(data);
        // System.out.println("data for while: i: " + i + " <= mid: " + mid + ", j: " + j + " <= end: " + end);//dane do while pobrane z call stacka

        while (i <= mid && j <= end){
            if (data[i] <= data[j]){
                temp[k] = data[i];
                System.out.println("---temp index:" + k + ", is: "+ temp[k] + ", i++ , k++");
                k++;
                i++;
                printArray(temp);
            } else {
                temp[k] = data[j];
                System.out.println("---temp index:" + k + ", is: "+ temp[k] + ", j++, k++");
                k++;
                j++;
                printArray(temp);
            }
        }

        while (i <= mid){
            temp[k] = data[i];
            System.out.println("rest---temp index:" + k + ", is: "+ temp[k] + ", i++, k++");
            k++;
            i++;
            printArray(temp);
        }

        while (j <= end){
            temp[k] = data[j];
             System.out.println("rest---temp index:" + k + ", is: "+ temp[k] + ", j++, k++");
            k++;
            j++;
            printArray(temp);
        }

        for (i = start; i <= end; i++){//start i end pobrane z call stacka
            data[i] = temp[i - start];
        }
    }
}
