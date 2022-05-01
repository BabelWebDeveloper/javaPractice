package com.javaBWD;

public class MsiManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        System.out.println("MSI just created GPU");
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        System.out.println("MSI just created monitor");
        return new MsiMonitor();
    }

}
