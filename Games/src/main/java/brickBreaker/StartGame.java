package brickBreaker;

import javax.swing.*;

class StartGame {

    StartGame() {
        JFrame obj = new JFrame();
        Gameplay gameplay = new Gameplay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Brick Breaker");
        obj.setResizable(false);
        obj.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        obj.add(gameplay);
        obj.setVisible(true);
    }
}