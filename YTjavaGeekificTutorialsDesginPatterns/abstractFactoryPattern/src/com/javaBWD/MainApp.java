package com.javaBWD;

import java.util.List;

public class MainApp {

    /*
     * Video Reference: https://youtu.be/QNpwWkdFvgQ
     */
    public static void main(String[] args) {

        Company msi = new MsiManufacturer();//zwraca obiekt company, dzięki dziedziczeniu może stworzyć nowe "dziecko" - MsiManufacturer, dziedziczenie sprawia że Company == MsiManufacturer
        Gpu msiGpu = msi.createGpu();//przez klasę abstrkacyjną (public abstract Gpu createGpu();) ma dostęp do metody dziecka
        Monitor msiMonitor = msi.createMonitor();//j.w.

//        Company asus = new AsusManufacturer();
//        Gpu asusGpu = asus.createGpu();
//        Monitor asusMonitor = asus.createMonitor();

//        List.of(msi.createGpu(), msi.createMonitor(), asus.createGpu(), asus.createMonitor())
//                .forEach(Product::assemble);

    }

}
