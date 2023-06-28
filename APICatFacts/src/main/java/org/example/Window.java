package org.example;

import javax.swing.*;

public class Window extends  JFrame{
    static final int SIZE = 500;
    public Window(){
        this.setSize(SIZE,SIZE);
        this.setTitle("One news");
        this.setIconImage(new ImageIcon("src/main/java/org/example/img.png").getImage());
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(new ControlPanel());
        this.setVisible(true);
    }

}
