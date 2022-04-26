// public class Main {
//     public static void main(String[] args) {
//         int[] data = new int[]{4,1,3,2,0,-1,7,10,9,20};
//         printArray(data);

//         System.out.println();
//         mergeSort(data,0, data.length - 1);

//         printArray(data);
//     }

//     public static void printArray(int [] arr){
//         System.out.println("---PRINT ARRAY---");
//         for (int i = 0; i < arr.length; i++){
//             System.out.println("index: " + i + "is: " + arr[i]);
//         }
//         System.out.println("---PRINT ARRAY---");
//     }

//     public static void mergeSort(int[] data, int start, int end){
//         System.out.println("mergeSort fire up -----");
//         if (start < end){
//             int mid = (start + end) / 2;

//             System.out.println("start:" + start + ", end: " + end);
//             mergeSort(data,start,mid);
//             System.out.println("LEFT Position: " + start + ", " + mid);
//             System.out.println("LEFT call stack: start:" + start + ", end: " + end);
//             System.out.println();

//             mergeSort(data,mid + 1, end);
//             System.out.println("RIGHT Position: " + (mid+1) + ", " + end);
//             System.out.println("RIGHT call stack : start: " + start + ", end: " + end);
//             System.out.println();

//             merge(data,start,mid,end);
//             System.out.println();
//         }
//     }

//     public static void merge(int[] data,int start,int mid,int end){
//         System.out.println("merge fire up -----");
//         int[] temp = new int[end - start + 1];
//         System.out.println("temp.length: " + temp.length);

//         int i = start, j = mid + 1, k = 0;

//         while (i <= mid && j <= end){
//             System.out.println("ORI ARRAY INDEX: i: " + i + ", j: " + j);
//             // DODAĆ PORÓWNANIE WARTOŚCI
//             if (data[i] <= data[j]){
//                 temp[k] = data[i];
//                 System.out.println("---temp index:" + k + ", is: "+ temp[k]);
//                 k++;
//                 i++;
//                 printArray(temp);
//             } else {
//                 temp[k] = data[j];
//                 System.out.println("---temp index:" + k + ", is: "+ temp[k]);
//                 k++;
//                 j++;
//                 printArray(temp);
//             }
//         }

//         while (i <= mid){
//             temp[k] = data[i];
//             System.out.println("---temp index:" + k + ", is: "+ temp[k]);
//             k++;
//             i++;
//             printArray(temp);
//         }

//         while (j <= end){
//             temp[k] = data[j];
//             System.out.println("---temp index:" + k + ", is: "+ temp[k]);
//             k++;
//             j++;
//             printArray(temp);
//         }

//         for (i = start; i <= end; i++){
//             data[i] = temp[i - start];
//         }
//     }
// }
