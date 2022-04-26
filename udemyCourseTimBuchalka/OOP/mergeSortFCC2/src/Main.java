public class Main {
    public static void main(String[] args) {
        int[] data = new int[]{4,1,3,2,0,-1,7,10,9,20};
        printArray(data);

        System.out.println();
        mergeSort(data,0, data.length - 1);

        printArray(data);
    }

    public static void printArray(int [] arr){
        System.out.println("PRINT ARRAY:");
        for (int i = 0; i < arr.length; i++){
            System.out.println("index: " + i + ", is: " + arr[i]);
        }
        System.out.println("PRINT ARRAY.");
        System.out.println();
    }

    public static void mergeSort(int[] data, int start, int end){
        System.out.println("mergeSort fire up -----");
        if (start < end){
            int mid = (start + end) / 2;

            int leftStart = start;
            int leftEnd = mid;
            System.out.println("Left start: " + leftStart + ", left end: " + leftEnd);
            mergeSort(data,leftStart,leftEnd);
            System.out.println("LEFT Call back: left start: "  + leftStart + ", left end: " + leftEnd);

            System.out.println();

            int rightStart = mid + 1;
            int rightEnd = end;
            System.out.println("Right start: (mid + 1) " + rightStart + ",right end: (latest matches mid from above mergeSort) " + rightEnd);
            mergeSort(data,rightStart, rightEnd);
            System.out.println("RIGHT Call back: right start: "  + rightStart + ", right end: " + rightEnd);

            System.out.println();

            merge(data,start,mid,end);
            System.out.println();
        }
    }

    public static void merge(int[] data,int start,int mid,int end){
        System.out.println("merge fire up -----");
        int tempLength = end - start + 1;
        int[] temp = new int[tempLength];
        System.out.println("Temp array reset, length is: " + tempLength);

        int k = 0;
        int leftStart = start;
        int leftEnd = mid;
        int rightStart = mid + 1;
        int rightEnd = end;

        while (leftStart <= leftEnd && rightStart <= rightEnd){
            System.out.println("Left start: " + leftStart + ", left end: " + leftEnd + ", right start: " + rightStart + ", right end: " + rightEnd);
            if (data[leftStart] <= data[rightStart]){
                temp[k] = data[leftStart];
                k++;
                leftStart++;
                printArray(temp);
            } else {
                temp[k] = data[rightStart];
                k++;
                rightStart++;
                printArray(temp);
            }
        }

        while (leftStart <= leftEnd){
            System.out.println("Rest---------------");
            System.out.println("Left start: " + leftStart + ", left end: " + leftEnd);
            temp[k] = data[leftStart];
            k++;
            leftStart++;
            printArray(temp);
        }

        while (rightStart <= rightEnd){
            System.out.println("Rest---------------");
            System.out.println("Right start: " + rightStart + ", right end: " + rightEnd);
            temp[k] = data[rightStart];
            k++;
            rightStart++;
            printArray(temp);
        }

        for (leftStart = start; leftStart <= rightEnd; leftStart++){
            data[leftStart] = temp[leftStart - start];
        }
    }
}
