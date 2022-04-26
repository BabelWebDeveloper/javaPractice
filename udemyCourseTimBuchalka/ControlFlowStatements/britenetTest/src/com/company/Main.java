package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int [] A = new int[5];
        System.out.println("Enter elements:");
        Scanner sc=new Scanner(System.in);

        for (int i=0;i<A.length-1;i++ ){
            A[i]=sc.nextInt();
        }
        System.out.println("Printing elements before sort:");
        for (int i : A){
            System.out.println(i);
        }
//        System.out.println("Printing elements after sort:");

    }
}
