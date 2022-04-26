package com.javaBWD;

import javax.swing.*;

public class JFrameOne extends JFrame {

    public JFrameOne(){
        initialize();
    }

    public void initialize(){
        setTitle("JFrameOne");//tytuł okienka aplikacji
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//co ma się stać po kliknięciu na krzyżyk - DISPOSE zamyka całą aplikację
        setSize(500,400);
        setLocationRelativeTo(null);//okno wyświetli się na środku ekranu
        setResizable(false);//okienko nie zmieni swojego rozmiaru
        setVisible(true);
    }
}
