public class Main {
    public static void main(String[] args) {
        int[] array = {7,2,3,4,0,8,7};
        minDistance(array);
    }

    private static void minDistance(int[] array){
        int minDistance = -1;
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array [j]){
                    int distance = j - i;
                    if (minDistance == -1){
                        minDistance = distance;
                    } else if (minDistance != -1 && minDistance > distance){
                        minDistance = distance;
                    }
                }
            }
        }
        System.out.println(minDistance);
    }
}

//    int minDistance = -1;
//        for (int i = 0; i < array.length - 1; i++){
//        int count = 0;
//        for (int j = i + 1; j < array.length; j++){
//        if (array[i] == array[j] && i == 0){
//        minDistance = j - i;
//        } else if (array[i] == array[j]){
//        count = j - i;
//        if (minDistance > count){
//        minDistance = count;
//        }
//        }
//        }
//        }
//        System.out.println(minDistance);