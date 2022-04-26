package com.javaBWD;

import javax.swing.*;

public class JFrameTwo {
    private JFrame frame;

    public JFrameTwo(){
        initialize();
    }

    private void initialize(){
        frame = new JFrame();
        this.frame.setTitle("JFrameTwo");//tytuł okienka aplikacji
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//co ma się stać po kliknięciu na krzyżyk - DISPOSE zamyka całą aplikację
        this.frame.setSize(500,400);
        this.frame.setLocationRelativeTo(null);//okno wyświetli się na środku ekranu
        this.frame.setResizable(false);//okienko nie zmieni swojego rozmiaru
        this.frame.setVisible(true);
    }
}
