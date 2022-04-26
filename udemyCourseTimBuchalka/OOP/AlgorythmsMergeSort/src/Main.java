import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();//class used to generate stream of random numbers
        int [] numbers = new int[10];


        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(1000000);//fill this 10 numbers array with random number from 0 to one million
        }

        int [] numbers2 = {1,10,2,3,9,8,4,5,7,6};


        System.out.println("Before:");
        printArray(numbers2);

        mergeSort(numbers2);

        System.out.println("\nAfter:");
        printArray(numbers2);
    }

    public static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println((i+1) + ". " + arr[i]);
        }
    }
//                                              {1,10,2,3,9,8,4,5,7,6}
//                                      {1,10,2,3,9}                {8,4,5,7,6}-- < here inputArray from marge call stack
//                                  {1,10}      {2,3,9}         {8,4}       {5,7,6}
//                              {1} {10}      {2}   {3,9}      {8} {4}     {5}  {7,6}
//                                                 {3} {9}                     {7} {6}

    public static void mergeSort(int[] inputArray){
        int inputLength = inputArray.length;

//        Stop dividing:
        if (inputLength < 2){
            return;
        }

//        Dividing array:
        int midIndex = inputLength / 2;
        int [] leftHalf = new int[midIndex];
        int [] rightHalf = new int[inputLength - midIndex];

//        Populating left array:
        for (int i = 0; i < midIndex; i++){
            leftHalf[i] = inputArray[i];
        }
//        Populating right array:
        for (int i = midIndex; i < inputLength; i++){
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);//liczba wywołań metod (funkcji) w call stacku musi się sobie równać !!!!!
        mergeSort(rightHalf);//do call stacka przekazywane są inputArray oraz lefi i right half, lefi i right half są edytowane w mergeSort i przekazywane do call stacka, natomiast input array jest edytowany w merge i również przekazywany do call stacka

//        Merge arrays:
        merge(inputArray,leftHalf,rightHalf);//przechodzi ostatni pasujący do breakpointa inputArray z call stacka, oraz te parametry które "zdążyły" się zadeklarować, {1} oraz {10} zadeklarowały się przy obliczaniu z inputArraya {1,10}
    }

//                                              {1,10,2,3,9,8,4,5,7,6}
//     here is inputArray from Merge ->{1,10,2,3,9}                    {8,4,5,7,6}
//                                  {1,10}      {2,3,9}<- this next {8,4}       {5,7,6}
//                              {1} {10}      {2}   {3,9}         {8} {4}      {5}  {7,6}
//                                                 {3} {9}                         {7} {6}
//    leftHalf y8
    public static void merge(int [] inputArray, int[] leftHalf, int [] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize){
            if (leftHalf[i] <= rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize){
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize){
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
