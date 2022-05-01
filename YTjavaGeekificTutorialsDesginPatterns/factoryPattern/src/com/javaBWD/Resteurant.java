package com.javaBWD;

public abstract class Resteurant {//przez rodzica można tworzyć klasy dziecka
    public Burger orderBurger(){
        Burger burger = createBurger();//metoda createBurger() zwraca obiekt burger (dostęp dzięki klasie abstrakcyjnej poniżej)
        burger.prepare();//zwrócony obiekt ma dostęp do metody prepare
        return burger;
    }
    public abstract Burger createBurger();//klasa absrakcyjna po to żeby uzyskać dostęp do metody zawartej w "dziecku"
}
