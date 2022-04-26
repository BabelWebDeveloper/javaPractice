package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;// 1 + 2 = 3
        System.out.println("Result = " + result);
        int poprzedniResult = result;// resulty są od siebie niezależne
        System.out.println("poprzedni result = " + poprzedniResult);
        result = result - 1; // update resultu;
        System.out.println("Result = " + result);// resulty są od siebie niezależne
        System.out.println("poprzedni result = " + poprzedniResult);//updatowanie resultu nie wpłynęło na zmienną zadeklarowaną w poprzedniej liniijce kodu

        result++;
        System.out.println("Result = " + result);
        result--;
        System.out.println("Result = " + result);
        result *= 10;
        System.out.println("Result = " + result);
    }
}
