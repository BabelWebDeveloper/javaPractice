package com.javaBWD;

public class VeggieBurgerPrepare extends Resteurant{
    @Override
    public Burger createBurger() {
        System.out.println("Veggie is preparing...");
        return new VeggieBurger();
    }
}
