package com.javaBWD;

public class Singleton {

    private static volatile Singleton instance;
    private String data;

    public Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        Singleton result = instance;//dzięki temu instance jest pobierane tylko jeden raz
        if (result == null){//jeśli wątek będzie chciał uzyskać dostęp do utworzonej instancji żeby nie musiał czekać - jeśli taka instancja już istnieje
            synchronized (Singleton.class){//jeśli inny wątek będzie chciał utworzyć nową instancję musi poczekać na swoją kolej - tylko jeden wątek może utworzyć nową instancję w tym samym czasie
                result = instance;
                if (result == null){//tworzy tylko jeśli nie ma instancji
                    instance = new Singleton(data);
                }
            }
        }
        return result;
    }
}
