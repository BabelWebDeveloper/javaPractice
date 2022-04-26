package com.javaBWD;

import javax.swing.*;

public class Launcher {
    public static void main(String[] args) {
//        cały kod musi zadziałać w jednym wątku - GUI (interfejs graficzny w Javie) działa jednowątkowo, natomiast Java działa wielowątkowo
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                MainWindow main = new MainWindow();
                main.show();
            }
        });
    }
}
