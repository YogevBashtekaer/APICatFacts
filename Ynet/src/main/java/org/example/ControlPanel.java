package org.example;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {
    private JTextField textField;
    private JButton button;
    private String userChoose;
    public ControlPanel() {
        this.userChoose = null;

        this.setSize(Window.SIZE,Window.SIZE);
        this.setBackground(new Color(85,64,92));
        this.setLayout(null);

        this.button =new JButton("search");
        this.button.setBounds(50,50,80,30);
        this.button.addActionListener((e)->{
            //todo add the search action
        });
        this.add(this.button);

        this.textField = new JTextField("enter the text");
        this.textField.setBounds(150,50,100,30);
        this.textField.addActionListener((e)->{
            this.userChoose = textField.getText();
            System.out.println(this.userChoose);

        });
        this.add(this.textField);

    }

    public String getUserChoose() {
        return userChoose;
    }
}
