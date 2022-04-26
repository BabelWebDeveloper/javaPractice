public class Main {
    public static void main(String[] args) {
        int [] array = {5,2,8,6,3,6,9,5};
//        find the longest subsequence
        System.out.println(findLengthSubsequence(array));
//        findLengthSubsequence2(array);
    }

    private static int findLengthSubsequence(int [] array){
        int length = 0;
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] < array[i + 1]){
                length++;
            }
        }
        return length;
    }

    private static void findLengthSubsequence2(int [] array){
        int length;
        int start;
        int [] store = new int[array.length];
        for (int i = 0; i < array.length; i++){
            length = 0;
            start = array[i];
            for (int j = 1 + i; j < array.length; j++){
                if (start < array[j]){
                    length++;
                    start = array[j];
                }
            }
            store[i] = length;
            System.out.println(length);
        }
    }
}
