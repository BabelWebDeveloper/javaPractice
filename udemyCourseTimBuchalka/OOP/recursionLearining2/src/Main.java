public class Main {
    public static void main(String[] args) {
//        int[] array = {-1,0,1,2,3,4,7,9,10,20};//must be sorted!
        // System.out.println(binarySearch(array, 0, 9, 10));
        System.out.println(fibonacciNonOpt(7));
    }

    public static int fibonacciNonOpt(int n){
        // breakpoint:
        if ((n == 0) || (n == 1)){//in seccond part of recursion n == 0;
            System.out.println("returned: " + n);
            return n;//after first part of recursion n == 1
        } else {
            System.out.println("after: " + n);
            return fibonacciNonOpt(n - 1) + fibonacciNonOpt(n - 2);//after brakpoint we back to return with n == 1 and 1 from call stach so n == 2; step 3 we take n = 0 from brakpoint and add 2 from call stack (so n == 2) and search another call stack where is 1 so n == 3;

            // when first part of recursion is finish, take n from call stock and sum with n from breakpoint, in this point seccond part of recursion is fired and subtract n as many times as n match breakpoint summed with n from call stack

            // first have done all fibonacciNonOpt(n - 1) until reach breakpoint, then fibonacciNonOpt(n - 2) have done in every number that was given from fibonacciNonOpt(n - 1)
        }
    }

    
    public static int binarySearch(int[] A, int left, int right, int x){//left is A[0], right is A[A.length - 1], x is middle value of an array

        if (left > right){
            return -1;
        }

        int mid = (left + right) / 2;

//        Breakpoint for recursion:
        if (x == A[mid]){
            return mid;
        }

        if (x < A[mid]){
            return binarySearch(A,left,mid - 1,x);//search in left half with right border - 1 (we already know it is not mid)
        } else {
            return binarySearch(A,mid + 1, right, x);//if x > middle point,search in right half
        }
    }
}
