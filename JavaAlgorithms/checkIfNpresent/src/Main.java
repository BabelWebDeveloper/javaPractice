public class Main {
    public static void main(String[] args) {
//        Write a C program to check a given array (length will be at least 2) of integers and return true if there are two values 15, 15 next to each other.
        int[] array = {1, 1, 5, 3, 5, 4, 15, 12, 11 };
        int n = 1;
        System.out.println(checkN(array,n));
        checkN(array,n);
    }

    private static boolean checkN(int[] array, int n){
        for (int i = 0; i < array.length - 1; i++){
            int check = array[i];
            if (check == array[i + 1] && check == n){
                return true;
            }
        }
        return false;
    }
}
