package com.javaBWD;

public class AsusManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        System.out.println("ASUS just created GPU");
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }

}
