public class Main {
    public static void main(String[] args) {
        int[] array = {2,5,16,18,24,42};
        int index = binarySearch(array,0,array.length - 1,5);
        System.out.println(index);
    }

    private static void searchIndex(int n, int[] array){
        int l = 0;
        int r = array.length - 1;
        System.out.println(binarySearch(array,l,r,n));
    }

    private static int binarySearch(int[] array, int l, int r, int n){
        if (r >= 1){
            int mid = (l + r) / 2;

            if (array[mid] == n){
                return mid;
            }

            if (n < array[mid]){
                return binarySearch(array,l,mid - 1,n);
            } else {
                return binarySearch(array,mid + 1,r,n);
            }
        }
        return -1;
    }
}
