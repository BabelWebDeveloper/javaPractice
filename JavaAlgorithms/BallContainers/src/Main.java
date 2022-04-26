import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {999336263, 998799923},
                {998799923, 999763019}
        };
        System.out.println(containers(array));
    }

    private static String containers(int[][] matrix) {
        int[] capacity = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            capacity[i] = matrix[i].length;
        }

//        int[] ballTypes = new int[Arrays.stream(capacity).max().getAsInt()];
        int[] ballTypes = {};
        for (int i = 0; i < capacity.length - 1; i++) {
            for (int j = 1; j < capacity.length; j++) {
                if (capacity[i] < capacity[j]){
                    ballTypes = new int[capacity[j]];
                } else {
                    ballTypes = new int[capacity[i]];
                }
            }
        }

        for (int i = 0; i < capacity.length; i++) {
            for (int j = 0; j < capacity[i]; j++) {
                ballTypes[j] += matrix[i][j];
            }
        }

//        sort capacity
        for (int i = 0; i < capacity.length - 1; i++) {
            for (int j = 1; j < capacity.length; j++) {
                if (capacity[i] < capacity[j]) {
                    int memo = capacity[i];
                    capacity[i] = capacity[j];
                    capacity[j] = memo;
                }
            }
        }

//        sort ballTypes
        for (int i = 0; i < ballTypes.length - 1; i++) {
            for (int j = 1; j < ballTypes.length; j++) {
                if (ballTypes[i] < ballTypes[j]) {
                    int memo = ballTypes[i];
                    ballTypes[i] = ballTypes[j];
                    ballTypes[j] = memo;
                }
            }
        }

        if (capacity.length != ballTypes.length){
            return "Impossible";
        } else {
            for (int i = 0; i < capacity.length; i++){
                if (capacity[i] < ballTypes[i]){
                    return "Impossible";
                }
            }
            return "Possible";
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
