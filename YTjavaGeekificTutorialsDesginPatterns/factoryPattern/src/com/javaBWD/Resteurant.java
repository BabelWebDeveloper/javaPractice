package com.javaBWD;

public abstract class Resteurant {//przez rodzica można tworzyć klasy dziecka
    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }
    public abstract Burger createBurger();//klasa absrakcyjna po to żeby uzyskać dostęp do metody zawartej w "dziecku"
}
