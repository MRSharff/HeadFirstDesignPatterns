package dev.msharff.weathermonitoringstation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(actionEvent -> System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(actionEvent -> System.out.println("Come on, do it!!"));


        frame.add(button);
        frame.setLocation(600, 700);
        frame.setSize(200, 200);
        button.setSize(200, 200);

        frame.setVisible(true);
    }


}
