package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isEvenNumber(2));

        int number = 4;
        int finishNumber = 20;
        int totalOfEven = 0;
        int count = 0;
        while (number <= finishNumber){
            number++;/*4 będzie natychmiast zwiększone do 5 więc tak naprawdę pętla zaczyna się od 5*/
            if (!isEvenNumber(number)){
                continue;/*oznacza zatrzymaj się tutaj, zrób to co jest w else, a potem dalej iteruj*/
            } else {
                totalOfEven += number;
                count++;
                if (count >= 5) {
                    break;
                }
                System.out.println("Even number " + number);
            }
        }
        System.out.println("Total number " + totalOfEven);
        System.out.println("Even found " + count);
    }
    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
