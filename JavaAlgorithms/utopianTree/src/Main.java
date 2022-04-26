public class Main {
    public static void main(String[] args) {
        utopianTree(5);
    }

    private static void utopianTree(int n){
        int height = 1;
        for (int i = 1; i <= n; i++){
            if (i % 2 != 0){
                height *= 2;
            } else {
                height++;
            }
        }
        System.out.println(height);
    }
}
