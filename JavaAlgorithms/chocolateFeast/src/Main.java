public class Main {
    public static void main(String[] args) {
//        chocolateFeast(15,3,2);
//        chocolateFeast(10 ,2,5);
//        chocolateFeast(12,4,4);
//        chocolateFeast(6,2,2);
        chocolateFeast(52805, 478, 13210);
    }

    private static void  chocolateFeast(int n, int c, int m){
        int eaten = n / c;
        int papers = eaten;
        while (papers >= m){
            int extra = papers / m;
            eaten += extra;
            papers = extra;
        }
        System.out.println(eaten);
    }
}
