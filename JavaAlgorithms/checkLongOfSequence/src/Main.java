public class Main {
    public static void main(String[] args) {
        int[] array = {1,1,1,1,2,3,4,4,4,5,0,0,0,0,0,0,0,0,6,7,7,9,7,7,7,7,7};
        System.out.println(checkSequence(array));
//        checkSequence(array);
    }

    private static int checkSequence(int[] array){
        int longest = 1;
        int series = 1;
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] == array[i+1]){
                series++;
            } else {
                if (series > longest){
                    longest = series;
                }
                series = 1;
            }
        }
        return longest;
    }
}
