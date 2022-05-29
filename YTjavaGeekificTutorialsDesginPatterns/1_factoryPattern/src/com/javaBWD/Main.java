package com.javaBWD;

public class Main {
    public static void main(String[] args) {
        Resteurant meatBurger = new BeefBurgerPrepare();//przez rodzica można tworzyć klasy dziecka
        Burger meat = meatBurger.orderBurger();
    }
}
