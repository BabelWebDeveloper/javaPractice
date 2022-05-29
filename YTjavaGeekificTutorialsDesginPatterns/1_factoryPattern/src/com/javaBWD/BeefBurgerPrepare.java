package com.javaBWD;

public class BeefBurgerPrepare extends Resteurant{
    @Override
    public Burger createBurger() {
        System.out.println("Beef is preparing...");
        return new BeefBurger();
    }
}
