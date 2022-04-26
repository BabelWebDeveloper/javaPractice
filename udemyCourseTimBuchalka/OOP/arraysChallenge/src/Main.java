public class Main {
    public static void main(String[] args) {
        int [] array1 = {1,9,2};
//        print(array1);
//        System.out.println(array1.length);
//
//        System.out.println();
//
//        int [] array2 = {2,4,6,8,0};
//        print(array2);
//
//        System.out.println();
//
//        array1 = array2;
//        print(array1);
//        System.out.println(array1.length);
//        int [] array1 = {1,8,2,3,7,4,6,5,9};
        getBig(array1);
        ;
    }

    public static void getBig(int [] array){
        int [] updatedArr = new int[array.length];
        int [] sorted = new int[array.length];

        for (int i = 0; i < array.length; i++){

            for (int j = 0; j < updatedArr.length; j++){
                if (j + 1 < updatedArr.length){
                    if (updatedArr[j] > updatedArr[j + 1]){
                        int big = updatedArr[j];
                        sorted[i] = big;
                    } else {
                        int big = updatedArr[j + 1];
                        sorted[i] = big;
                    }
                } else {
                    int big = updatedArr[j];
                    sorted[i] = big;
                }
            }

            int [] newArr = {};//

            for (int k = 0, l = 0; k < updatedArr.length; k++){
                if (updatedArr.length <= 1){
                    break;
                } else {
                    if (updatedArr[k] != sorted[i]){
                        newArr[l++] = updatedArr[k];
                    }
                }
            }

            updatedArr = newArr;
            print(sorted);
        }
    }

    public static void print(int [] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(i + " element of an array is: " + array[i]);
        }
    }
}



