public class Main {
    public static void main(String[] args) {
        int [] array = {4,1,3,2,0,-1,7,10,9,20};
        mergeArray(array);
        printArray(array);
    }

    private static void mergeArray(int[] array){
        int length = array.length;

        if (length < 2){
            return;
        }

        int mid = length / 2;

        int [] leftSide = new int[mid];
        int [] rightSide = new int[length - mid];

        for (int i = 0; i < mid; i++){
            leftSide[i] = array[i];
        }

        for (int j = mid; j < length; j++){
            rightSide[j - mid] = array[j];
        }

        mergeArray(leftSide);
        mergeArray(rightSide);

        merge(array,leftSide,rightSide);
    }

    private static void merge(int[] array, int[] leftSide, int[] rightSide){
        int leftLength = leftSide.length;
        int rightLength = rightSide.length;

        int l = 0, r = 0, k = 0;

        while (l < leftLength && r < rightLength){
            if (leftSide[l] > rightSide[r]){
                array[k] = leftSide[l];
                l++;
            } else {
                array[k] = rightSide[r];
                r++;
            }
            k++;
        }

        while (l < leftLength){
            array[k] = leftSide[l];
            k++;l++;
        }

        while (r < rightLength){
            array[k] = rightSide[r];
            k++;r++;
        }
    }

    private static void printArray(int[] array){
        System.out.println("Array list:");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
