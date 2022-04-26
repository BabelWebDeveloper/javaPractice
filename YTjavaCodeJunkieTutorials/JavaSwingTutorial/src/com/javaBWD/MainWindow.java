package com.javaBWD;

import javax.swing.*;

public class MainWindow {
    private JFrame window;

    public MainWindow(){
        this.window = new JFrame();
        window.setTitle("Hello world!");//tytuł okienka aplikacji
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//co sięstanie po kliknięciu X (przycisk zamknięcia w prawym górnym rogu)
        window.setSize(800,500);
        window.setLocation(null);//w jakim miejscu ma się wyświetlić okienko
    }

    public void show(){
        window.setVisible(true);
    }
}
