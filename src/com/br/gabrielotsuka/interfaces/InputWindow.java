package com.br.gabrielotsuka.interfaces;

import javax.swing.*;
import java.awt.*;

public class InputWindow {

    Dimension dimension = new Dimension(420, 420);
    JFrame frame = new JFrame();


    public void startFrame(String title) {
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(dimension);
        frame.setTitle(title);
    }
}

