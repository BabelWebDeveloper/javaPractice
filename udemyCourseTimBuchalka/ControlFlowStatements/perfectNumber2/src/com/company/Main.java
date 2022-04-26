package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPerfectNumber(5));
    }

    public static boolean isPerfectNumber(int numer){

        if (numer < 1){
            return false;
        }

        else {
            int r = 1;
            int suma = 0;

            while (r < numer){
                if (numer % r == 0){
                    suma += r;
                }
                r++;
            }

            if (suma == numer){
                return true;
            }

            else {
                return false;
            }
        }
    }
}
