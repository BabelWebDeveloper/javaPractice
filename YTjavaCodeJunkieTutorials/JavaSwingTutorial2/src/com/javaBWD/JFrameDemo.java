package com.javaBWD;

import javax.swing.*;

public class JFrameDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrameOne frame1 = new JFrameOne();
//                JFrameTwo frame2 = new JFrameTwo();
            }
        });
    }
}
